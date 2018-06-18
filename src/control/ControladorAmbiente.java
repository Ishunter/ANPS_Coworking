package control;

import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionExcluidoComSucesso;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import java.util.ArrayList;
import model.Ambiente;
import model.AmbienteDAO;
import view.FrameMenu;

public class ControladorAmbiente {

	private static ControladorAmbiente instance = null;
	private FrameMenu view;

	private ControladorAmbiente() {
	}

	public void salvar(String nome, String custo, String qtd, String desc) throws ExceptionSalvoComSucesso, ExceptionInput, ExceptionCancelar {
		// not null check
		if (nome.isEmpty()) {
			throw new ExceptionInput("Por favor preencher campos.");
		}
		// custo Check
		if (Double.valueOf(custo) < 0) {
			throw new ExceptionInput("Custo deve ser maior que 0.");
		}
		// qtd Check
		if (Integer.valueOf(qtd) < 0) {
			throw new ExceptionInput("Quantidade de estações deve ser maior que 0.");
		}
		// PK Check
		if (isNomeInUse(nome)) {
			boolean atualizarDados = CtrlUtil.getInstance().PanelYesOrNo(
				"Já existe um Ambiente com este Nome.\nDeseja atualizar os dados?",
				"Deseja atualizar os dados?");
			if (atualizarDados) {
				AmbienteDAO.getInstance().update(nome, custo, qtd, desc);
				throw new ExceptionSalvoComSucesso("Ambiente");
			} else {
				throw new ExceptionCancelar();
			}
		} else {
			AmbienteDAO.getInstance().create(nome, custo, qtd, desc);
			throw new ExceptionSalvoComSucesso("Ambiente");
		}
	}

	public void excluir(String nome) throws ExceptionExcluidoComSucesso, ExceptionCancelar {
		if (isNomeInUse(nome)) {
			boolean atualizarDados = CtrlUtil.getInstance().PanelYesOrNo(
				"Deseja excluir o Ambiente "+nome+"?",
				"Deseja excluir?");
			if (atualizarDados) {
				AmbienteDAO.getInstance().delete(AmbienteDAO.getInstance().read(nome));
				throw new ExceptionExcluidoComSucesso("Ambiente");
			} else {
				throw new ExceptionCancelar();
			}
		}
	}
	public static ControladorAmbiente getInstance() {
		if (instance == null) {
			instance = new ControladorAmbiente();
		}
		return instance;
	}

	public ArrayList<String> getAllAmbientes() {
		ArrayList<String> array = new ArrayList<>();
		for (Ambiente a : AmbienteDAO.getInstance().getAll()) {
			array.add(a.getNome());
		}
		return array;
	}

	public Ambiente getAmb(String nome) {
		return AmbienteDAO.getInstance().read(nome);
	}

	public double getCusto(String nome) {
		return AmbienteDAO.getInstance().read(nome).getCusto();
	}

	public void setView(FrameMenu view) {
		this.view = view;
		this.view.setVisible(false);
	}

	public void exit() {
		this.view.setVisible(true);
	}

	public ArrayList<String> getAmbienteView(String nome) {
		ArrayList<String> array = new ArrayList<>();
		Ambiente f = AmbienteDAO.getInstance().read(nome);
		if (f != null) {
			array.add(f.getNome());
			array.add(String.valueOf(f.getCusto()));
			array.add(String.valueOf(f.getQtdEstacoesTrabalho()));
			array.add(f.getDescricao());
		}
		return array;
	}

	private boolean isNomeInUse(String nome) {
		return AmbienteDAO.getInstance().read(nome) != null;
	}
}
