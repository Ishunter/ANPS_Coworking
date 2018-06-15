package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AmbienteDAO {

    private static AmbienteDAO instance = null;

    private AmbienteDAO() {
    }

    public static AmbienteDAO getInstance() {
        if (instance == null) {
            instance = new AmbienteDAO();
        }
        return instance;
    }

    public void create(Ambiente ambiente) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "INSERT INTO public.ambiente(custo, descricao, nome, qtdestacoestrabalho) VALUES (?, ?, ?, ?)";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setDouble(1, ambiente.getCusto());
            query.setString(2, ambiente.getDescricao());
            query.setString(3, ambiente.getNome());
            query.setInt(4, ambiente.getQtdEstacoesTrabalho());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("AmbienteDAO.create() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao inserir ambiente no banco.");
        }
    }

    public Ambiente read(String nome) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "SELECT * FROM public.ambiente WHERE nome = ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, nome);
            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                Ambiente a = new Ambiente();
                a.setCusto(rs.getDouble("custo"));
                a.setDescricao(rs.getString("descricao"));
                a.setNome(rs.getString("nome"));
                a.setQtdEstacoesTrabalho(rs.getInt("qtdestacoestrabalho"));
                return a;
            }
        } catch (SQLException ex) {
            System.err.println("AmbienteDAO.read() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao ler ambiente do banco.");
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
            System.err.println("AmbienteDAO.update() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao atualizar ambiente no banco.");
        }
    }

    public ArrayList<Ambiente> getAll() {
        Connection conn = control.ConexaoBD.getConnection();
        ArrayList<Ambiente> r = new ArrayList<>();
            
        String sql = "SELECT * FROM public.ambiente";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Ambiente amb = new Ambiente();
                amb.setCusto(rs.getDouble("custo"));
                amb.setDescricao(rs.getString("descricao"));
                amb.setNome(rs.getString("nome"));
                amb.setQtdEstacoesTrabalho(rs.getInt("qtdestacoestrabalho"));
                r.add(amb);
            }
        } catch (SQLException ex) {
            System.err.println("AmbienteDAO.getAll() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao listar todos ambientes do banco.");
        }
        return r;
    }

    public void delete(Ambiente ambiente) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "DELETE FROM public.ambiente WHERE nome like ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, ambiente.getNome());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("AmbienteDAO.delete() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao deletar ambiente do banco.");
        }
    }

}