package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecursoDAO {
	 public void create(Recurso recurso) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
            
        String sql = "Insert Into Recurso (custo, nome, descricao) Values (?, ?, ?)";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setDouble(1, recurso.getCusto());
			query.setString(2, recurso.getDescricao());
			query.setString(3, recurso.getNome());
			query.execute();
		}
    }
    
    public Recurso read(int login) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
		
        String sql = "Select * from Recurso where nome like ?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setInt(1, login);
			ResultSet rs = query.executeQuery();
			if (rs.next()){
				Recurso f = new Recurso();
				f.setCusto(rs.getDouble("custo"));
				f.setDescricao(rs.getString("descricao"));
				f.setNome(rs.getString("nome"));
				return f;
			}
		}
        return null;
    }
    
    public void update(Recurso recurso) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
		
		String sql = "Update Into Recurso (custo, descricao) Values (?, ?) where nome like ?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setDouble(1, recurso.getCusto());
			query.setString(2, recurso.getDescricao());
			query.setString(3, recurso.getNome());
			query.execute();
		}
    }
    
    public void delete(Recurso recurso) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
		
        String sql = "Delete * from Recurso where nome like ?";
		try (PreparedStatement query = conn.prepareStatement(sql)) {
			query.setString(1, recurso.getNome());
		}
    }
}
