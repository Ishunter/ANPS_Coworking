package _init;

import java.sql.SQLException;
import model.Funcionario;
import model.FuncionarioDAO;

public class Coworking {
	private static Funcionario f;
	
    public static void main(String[] args) {
		f = new Funcionario(1, "Lucas", "1234");
		try {
			new FuncionarioDAO().create(f);
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
    }
    
}
