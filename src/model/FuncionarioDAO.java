package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
    public void createRegistro(Funcionario func) throws SQLException{
        Connection conn = control.ConexaoBD.getConnection();
            
        String sql = " Insert Into Funcionario (nome, usuario, senha) Values (?, ?, ?) ";
        PreparedStatement query = conn.prepareStatement(sql);
        //query.setString(1, func.getNome());
        //query.setString(2, func.getUser());
        //query.setString(3, func.getSenha());
        query.execute();
    }
    
    public Funcionario readRegistro(Funcionario func){
        Connection conn = control.ConexaoBD.getConnection();
        
        return null;
    }
    
    public void updateRegistro(Funcionario func){
        Connection conn = control.ConexaoBD.getConnection();
    }
    
    public void deleteRegistro(Funcionario func){
        Connection conn = control.ConexaoBD.getConnection();
        
    }
}
