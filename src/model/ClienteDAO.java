package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {

    private static ClienteDAO instance = null;

    private ClienteDAO() {
    }

    public static ClienteDAO getInstance() {
        if (instance == null) {
            instance = new ClienteDAO();
        }
        return instance;
    }

    public void create(Cliente cliente) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "INSERT INTO public.cliente (atividade, cpf, endereco, estainadimplente, idade, nome, observacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, cliente.getAtividade());
            query.setString(2, cliente.getCpf());
            query.setString(3, cliente.getEndereco());
            query.setBoolean(4, cliente.isEstaInadimplente());
            query.setInt(5, cliente.getIdade());
            query.setString(6, cliente.getNome());
            query.setString(7, cliente.getObservacao());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("ClienteDAO.create() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao inserir cliente no banco.");
        }
    }

    public void create(String atividade, String cpf, String endereco, int idade, String nome, String observacao) {
        this.create(new Cliente(atividade, cpf, endereco, false, idade, nome, observacao));
    }

    public Cliente read(String cpf) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "SELECT * FROM public.cliente WHERE cpf = ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, cpf);
            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                Cliente c = new Cliente();
                c.setAtividade(rs.getString("atividade"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setEstaInadimplente(rs.getBoolean("estainadimplente"));
                c.setIdade(rs.getInt("idade"));
                c.setNome(rs.getString("nome"));
                c.setObservacao(rs.getString("observacao"));
                return c;
            }
        } catch (SQLException ex) {
            System.err.println("ClienteDAO.read() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao ler cliente do banco.");
        }
        return null;
    }

    public void update(Cliente cliente) {
        Connection conn = control.ConexaoBD.getConnection();

        String sql = "UPDATE public.cliente SET atividade=?, endereco=?, estainadimplente=?, idade=?, nome=?, observacao=? WHERE cpf like ?";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setString(1, cliente.getAtividade());
            query.setString(2, cliente.getEndereco());
            query.setBoolean(3, cliente.isEstaInadimplente());
            query.setInt(4, cliente.getIdade());
            query.setString(5, cliente.getNome());
            query.setString(6, cliente.getObservacao());
            query.setString(7, cliente.getCpf());
            query.execute();
        } catch (SQLException ex) {
            System.err.println("ClienteDAO.update() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao atualizar clientes no banco.");
        }
    }
    
    public void update(String atividade, String cpf, String endereco, boolean estaInadimplente, int idade, String nome, String observacao) {
        this.update(new Cliente(atividade, cpf, endereco, estaInadimplente, idade, nome, observacao));
    }

    public ArrayList<Cliente> getAll() {
        Connection conn = control.ConexaoBD.getConnection();
        ArrayList<Cliente> r = new ArrayList<>();

        String sql = "SELECT * FROM public.cliente";
        try (PreparedStatement query = conn.prepareStatement(sql)) {
            ResultSet rs = query.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setAtividade(rs.getString("atividade"));
                c.setCpf(rs.getString("cpf"));
                c.setEndereco(rs.getString("endereco"));
                c.setEstaInadimplente(rs.getBoolean("estainadimplente"));
                c.setIdade(rs.getInt("idade"));
                c.setNome(rs.getString("nome"));
                c.setObservacao(rs.getString("observacao"));
                r.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("ClienteDAO.getAll() -> " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Problema ao listar todos cliente do banco.");
        }
        return r;
    }
}
