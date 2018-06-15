package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class LocacaoDAO {

    private static LocacaoDAO instance = null;

    private LocacaoDAO() {
    }

    public static LocacaoDAO getInstance() {
        if (instance == null) {
            instance = new LocacaoDAO();
        }
        return instance;
    }

    public void create(Locacao locacao) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "INSERT INTO public.locacao(datafinal, datainicial, qtdestacoeslocadas, funcionario, cliente, ambiente) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setDate(1, utilToSql(locacao.getDataFinal()));
            query.setDate(2, utilToSql(locacao.getDataInicial()));
            query.setInt(3, locacao.getQtdEstacoesLocadas());
            query.setInt(4, locacao.getFuncionario().getLogin());
            query.setString(5, locacao.getCliente().getCpf());
            query.setString(6, locacao.getAmbiente().getNome());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("LocacaoDAO.create() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao inserir locação no banco.");
        }

        if (!locacao.getRecurso().isEmpty()) {
            for (Recurso r : locacao.getRecurso()) {
                sql = "INSERT INTO rl_recursos(cliente, ambiente, recurso) VALUES (?, ?, ?)";

                try (PreparedStatement query = conn.prepareStatement(sql)) {
                    query.setString(1, locacao.getCliente().getCpf());
                    query.setString(2, locacao.getAmbiente().getNome());
                    query.setString(3, r.getNome());
                    query.execute();
                } catch (SQLException ex) {
                    System.err.println("LocacaoDAO.create() -> " + ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Problema ao inserir locação no banco.");
                }
            }
        }

    

    public Locacao read(String nome) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "SELECT * FROM public.ambiente WHERE nome = ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, nome);
            ResultSet rs = query.executeQuery();
            if (rs.next()) {

                Locacao l = new Locacao();
                /*
                l.setCusto(rs.getDouble("custo"));
                l.setDescricao(rs.getString("descricao"));
                l.setNome(rs.getString("nome"));
                l.setQtdEstacoesTrabalho(rs.getInt("qtdestacoestrabalho"));
                 */
                return l;
            }
        } catch (SQLException ex) {
            System.err.println("LocacaoDAO.read() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao ler locação do banco.");
        }
        return null;
    }

    public void update(Ambiente ambiente) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "UPDATE public.ambiente SET custo=?, descricao=?, qtdestacoestrabalho=? WHERE nome=?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setDouble(1, ambiente.getCusto());
            query.setString(2, ambiente.getDescricao());
            query.setInt(3, ambiente.getQtdEstacoesTrabalho());
            query.setString(4, ambiente.getNome());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("LocacaoDAO.update() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao atualizar locação no banco.");
        }
    }

    public ArrayList<Locacao> getAll() {
        Connection conn = control.ConexaoBD.getConnection();
        ArrayList<Locacao> r = new ArrayList<>();

        String sql = "SELECT * FROM public.locacao";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Locacao l = new Locacao();
                /*
                l.setLogin(rs.getInt("login"));
                l.setNome(rs.getString("nome"));
                l.setSenha(rs.getString("senha"));
                 */
                r.add(l);
            }
        } catch (SQLException ex) {
            System.err.println("LocacaoDAO.getAll() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao listar todos locação do banco.");
        }
        return r;
    }

    private Date SqlToUtil(java.sql.Date sql) {
        try {
            String strData = sql.toString();
            Date objDate = new SimpleDateFormat("yyyy/MM/dd").parse(strData);
            return objDate;
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    private java.sql.Date utilToSql(Date date) {
        try {
            String strData = date.toString();
            java.sql.Date objDate = (java.sql.Date) new SimpleDateFormat("yyyy/MM/dd").parse(strData);
            return objDate;
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
