package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {
	
    public void create(Funcionario funcionario) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
            
        String sql = "INSERT INTO public.funcionario (login, nome, senha) VALUES (?, ?, ?)";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setInt(1, funcionario.getLogin());
			query.setString(2, funcionario.getNome());
			query.setString(3, funcionario.getSenha());
			query.execute();
		}
    }
    
    public Funcionario read(int login) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
		
        String sql = "SELECT * FROM public.funcionario WHERE login = ?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setInt(1, login);
			ResultSet rs = query.executeQuery();
			if (rs.next()){
				Funcionario f = new Funcionario();
				f.setLogin(rs.getInt("login"));
				f.setNome(rs.getString("nome"));
				f.setSenha(rs.getString("senha"));
				return f;
			}
		}
        return null;
    }
    
    public void update(Funcionario funcionario) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
		
		String sql = "UPDATE public.funcionario	SET nome=?, senha=? WHERE login=?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setString(1, funcionario.getNome());
			query.setString(2, funcionario.getSenha());
			query.setInt(3, funcionario.getLogin());
			query.execute();
		}
    }
}
