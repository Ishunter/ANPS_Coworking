package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RecursoDAO {

    private static RecursoDAO instance = null;

    private RecursoDAO() {
    }

    public static RecursoDAO getInstance() {
        if (instance == null) {
            instance = new RecursoDAO();
        }
        return instance;
    }

    public void create(Recurso recurso) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "INSERT INTO public.recurso (custo, descricao, nome) VALUES (?, ?, ?)";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setDouble(1, recurso.getCusto());
            query.setString(2, recurso.getDescricao());
            query.setString(3, recurso.getNome());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("RecursoDAO.create() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao inserir recurso no banco.");
        }
    }

    public Recurso read(int login) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "SELECT * FROM public.recurso WHERE nome like ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setInt(1, login);
            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                Recurso f = new Recurso();
                f.setCusto(rs.getDouble("custo"));
                f.setDescricao(rs.getString("descricao"));
                f.setNome(rs.getString("nome"));
                return f;
            }
        } catch (SQLException ex) {
            System.err.println("RecursoDAO.read() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao ler recurso do banco.");
        }
        return null;
    }

    public void update(Recurso recurso) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "UPDATE public.recurso SET custo=?, descricao=? WHERE nome like ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setDouble(1, recurso.getCusto());
            query.setString(2, recurso.getDescricao());
            query.setString(3, recurso.getNome());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("RecursoDAO.update() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao atualizar recurso no banco.");
        }
    }

    public void delete(Recurso recurso) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "DELETE FROM public.recurso WHERE nome like ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, recurso.getNome());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("RecursoDAO.delete() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao deletar recurso no banco.");
        }
    }

    public ArrayList<Recurso> getAll() {
        Connection conn = control.ConexaoBD.getConnection();
        ArrayList<Recurso> r = new ArrayList<>();

        String sql = "SELECT * FROM public.recurso";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Recurso f = new Recurso();
                f.setCusto(rs.getDouble("custo"));
                f.setDescricao(rs.getString("descricao"));
                f.setNome(rs.getString("nome"));
                r.add(f);
            }
        } catch (SQLException ex) {
            System.err.println("RecursoDAO.getAll() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao listar todos recursos do banco.");
        }
        return r;
    }
}
