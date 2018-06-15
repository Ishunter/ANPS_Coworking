package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GerenteDAO {
	private static GerenteDAO instance = null;

	private GerenteDAO(){ }
	
	public static GerenteDAO getInstance(){
		if (instance == null) {
			instance = new GerenteDAO();
		}
		return instance;
	}
	
	public void create(Funcionario funcionario) {
        Connection conn = control.ConexaoBD.getConnection();
           
		FuncionarioDAO.getInstance().create(funcionario);
        String sql = "INSERT INTO public.gerente (login) VALUES (?)";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setInt(1, funcionario.getLogin());
			query.execute();
		} catch (SQLException ex) {
			System.err.println("GerenteDAO.create() -> "+ex.getMessage());
			JOptionPane.showMessageDialog(null, "Problema ao inserir gerente do banco.");
		}
    }
    
    public Gerente read(int login) {
        Connection conn = control.ConexaoBD.getConnection();
		
		String sql = "SELECT * FROM public.gerente WHERE login = ?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setInt(1, login);
			ResultSet rs = query.executeQuery();
			if (rs.next()){	
				return new Gerente(FuncionarioDAO.getInstance().read(login));
			}
		} catch (SQLException ex) {
			System.err.println("GerenteDAO.read() -> "+ex.getMessage());
			JOptionPane.showMessageDialog(null, "Problema ao ler gerente do banco.");
		}
        return null;
    }
}
