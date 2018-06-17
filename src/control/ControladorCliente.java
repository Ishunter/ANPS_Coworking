package control;

import java.util.ArrayList;
import model.Cliente;
import model.ClienteDAO;

public class ControladorCliente {
    private static ControladorCliente instance = null;

	private ControladorCliente() {
	}

	public static ControladorCliente getInstance() {
		if (instance == null) {
			instance = new ControladorCliente();
		}
		return instance;
	}
	
	public void Cadastrar(String Atividade, String cpf, String endereco, boolean estaInadimplente, int idade, String nome, String observacao){
		
	}
	
	public ArrayList<Cliente> FiltrarPorNome(String nome){
		return null;
	}
	
	public ArrayList<String> getAllClientes() {
		ArrayList<String> array = new ArrayList<>();
		for (Cliente c : ClienteDAO.getInstance().getAll()) {
			array.add(c.getCpf() + "#" + c.getNome());
		}
		return array;
	}
	
	public Cliente getCli(String cpf){
		return ClienteDAO.getInstance().read(cpf);
	}
}
