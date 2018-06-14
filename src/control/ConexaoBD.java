package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    private static Connection conn = null;
    private static final String URL = "jdbc:postgresql://localhost:5432/coworking";
    private static final String USER = "coworking";
    private static final String PASS = "1234";
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException ex) {
                 System.out.println("ConexaoBD.getConnection() -> "+ex.getMessage());
                 JOptionPane.showMessageDialog(null, "Problema ao conectar ao Banco de Dados.");
            }
        }
        return conn;
    }
    
    public static void close(){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                 System.out.println("ConexaoBD.close() -> "+ex.getMessage());
                 JOptionPane.showMessageDialog(null, "Erro ao fechar conexão ao Banco.");
            }
        }
    }
}