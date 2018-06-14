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
            } catch (SQLException e) {
                 System.out.println(e.getMessage());
                 JOptionPane.showMessageDialog(null, "Problema ao conectar ao Banco de Dados.");
            }
        }
        
        return conn;
    }
}