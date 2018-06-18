package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {

    private static FuncionarioDAO instance = null;

    private FuncionarioDAO() {
    }

    public static FuncionarioDAO getInstance() {
        if (instance == null) {
            instance = new FuncionarioDAO();
        }
        return instance;
    }

    public void create(Funcionario funcionario) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "INSERT INTO public.funcionario (login, nome, senha) VALUES (?, ?, ?)";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setInt(1, funcionario.getLogin());
            query.setString(2, funcionario.getNome());
            query.setString(3, funcionario.getSenha());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("FuncionarioDAO.create() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao inserir funcionario do banco.");
        }
    }

    public void create(String login, String nome, String senha) {
        this.create(new Funcionario(Integer.valueOf(login), nome, senha));
    }

    public Funcionario read(int login) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "SELECT * FROM public.funcionario WHERE login = ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setInt(1, login);
            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                Funcionario f = new Funcionario();
                f.setLogin(rs.getInt("login"));
                f.setNome(rs.getString("nome"));
                f.setSenha(rs.getString("senha"));
                return f;
            }
        } catch (SQLException ex) {
            System.err.println("FuncionarioDAO.read() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao ler funcionario do banco.");
        }
        return null;
    }

    public void update(Funcionario funcionario) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "UPDATE public.funcionario	SET nome=?, senha=? WHERE login=?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, funcionario.getNome());
            query.setString(2, funcionario.getSenha());
            query.setInt(3, funcionario.getLogin());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("FuncionarioDAO.update() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao atualizar funcionario do banco.");
        }
    }

    public void update(String login, String nome, String senha) {
        update(new Funcionario(Integer.valueOf(login), nome, senha));
    }

    public ArrayList<Funcionario> getAll() {
        Connection conn = control.ConexaoBD.getConnection();
        ArrayList<Funcionario> r = new ArrayList<>();

        String sql = "SELECT * FROM public.funcionario WHERE login NOT IN (SELECT * fROM public.gerente) ORDER BY login DESC";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setLogin(rs.getInt("login"));
                f.setNome(rs.getString("nome"));
                f.setSenha(rs.getString("senha"));
                r.add(f);
            }
        } catch (SQLException ex) {
            System.err.println("FuncionarioDAO.getAll() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao listar todos funcionario do banco.");
        }
        return r;
    }
}
