package control;

import control.exceptions.ExceptionSalvoComSucesso;
import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionInput;
import java.util.ArrayList;
import model.Funcionario;
import model.FuncionarioDAO;

public class ControladorFuncionario {

	private static ControladorFuncionario instance = null;

	private ControladorFuncionario() {
	}

	public static ControladorFuncionario getInstance() {
		if (instance == null) {
			instance = new ControladorFuncionario();
		}
		return instance;
	}

	public ArrayList<String> getAllFuncionarios() {
		ArrayList<String> array = new ArrayList<>();
		for (Funcionario f : FuncionarioDAO.getInstance().getAll()) {
			array.add(Integer.toString(f.getLogin()) + "#" + f.getNome());
		}
		return array;
	}

	public ArrayList<String> getFuncionario(String login) {
		ArrayList<String> array = new ArrayList<>();
		Funcionario f = FuncionarioDAO.getInstance().read(Integer.valueOf(login));
		if (f != null) {
			array.add(Integer.toString(f.getLogin()));
			array.add(f.getNome());
			array.add(f.getSenha());
		}
		return array;
	}

	public void salvar(String login, String nome, String senha1, String senha2) throws ExceptionSalvoComSucesso, ExceptionInput, ExceptionCancelar {
		// Senha Check
		if (senha1.length() < 4 && senha1.length() < 8) {
			throw new ExceptionInput("Senha deve ter ao menos 4 e no maximo 8 caracteres.");
		}
		if (!senha1.equals(senha2)) {
			throw new ExceptionInput("Senhas não conferem.");
		}
		// PK Check
		if (isLoginInUse(login)) {
			boolean atualizarDados = CtrlUtil.getInstance().PanelYesOrNo(
				"Já existe um Funcionario com este Login.\nDeseja atualizar os dados?", 
				"Deseja atualizar os dados?");
			if (atualizarDados) {
				FuncionarioDAO.getInstance().update(login, nome, senha1);
				throw new ExceptionSalvoComSucesso("Funcionario");
			} else {
				throw new ExceptionCancelar();
			}
		} else {
			FuncionarioDAO.getInstance().create(login, nome, senha1);
			throw new ExceptionSalvoComSucesso("Funcionario");
		}
	}

	private boolean isLoginInUse(String login) {
		return FuncionarioDAO.getInstance().read(Integer.valueOf(login)) != null;
	}
}
