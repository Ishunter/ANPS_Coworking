package control;

import java.util.ArrayList;
import model.Recurso;
import model.RecursoDAO;
import view.FrameMenu;

public class ControladorRecurso {

	private static ControladorRecurso instance = null;
	private ArrayList<Recurso> recursosAdicionados = new ArrayList<>();
	private ArrayList<Recurso> recursosDisponiveis = new ArrayList<>();
	private FrameMenu view;

	private ControladorRecurso() {
	}

	public static ControladorRecurso getInstance() {
		if (instance == null) {
			instance = new ControladorRecurso();
		}
		return instance;
	}

	public void loadRecursoLocacao(String cliente, String ambiente) {
		novaLocacao();
		for (Recurso r : RecursoDAO.getInstance().getAlocados(cliente, ambiente)) {
			this.recursosAdicionados.add(r);
		}
	}

	public void novaLocacao() {
		this.recursosAdicionados = new ArrayList<>();
		this.recursosDisponiveis = new ArrayList<>();

		for (Recurso r : RecursoDAO.getInstance().getDisponiveis()) {
			this.recursosDisponiveis.add(r);
		}
	}

	public ArrayList<String> getDisponiveis() {
		ArrayList<String> array = new ArrayList<>();
		if (this.recursosDisponiveis != null) {
			for (Recurso r : this.recursosDisponiveis) {
				array.add(r.getNome());
			}
		}
		return array;
	}

	public void addDisponiveis(String recurso) {
		Recurso r = RecursoDAO.getInstance().read(recurso);
		if (r != null) {
			for (Recurso rem : recursosAdicionados) {
				if (rem.getNome().equals(r.getNome())) {
					recursosAdicionados.remove(rem);
					break;
				}
			}
			this.recursosDisponiveis.add(r);
		}
	}

	public ArrayList<String> getAdicionados() {
		ArrayList<String> array = new ArrayList<>();
		if (this.recursosAdicionados != null) {
			for (Recurso r : this.recursosAdicionados) {
				array.add(r.getNome());
			}
		}
		return array;
	}

	public void addAdicionados(String recurso) {
		Recurso r = RecursoDAO.getInstance().read(recurso);
		if (r != null) {
			this.recursosAdicionados.add(r);
			for (Recurso rem : recursosDisponiveis) {
				if (rem.getNome().equals(r.getNome())) {
					recursosDisponiveis.remove(rem);
					break;
				}
			}
		}
	}

	public void salvar() {

	}

	public ArrayList<Recurso> salvarRlRecursos() {
		return recursosAdicionados;
	}

	public void print() {
		System.out.println("Adicionados:");
		if (!recursosAdicionados.isEmpty()) {
			for (Recurso r : recursosAdicionados) {
				System.out.println("   " + r.getNome());
			}
		}
		System.out.println("Disponiveis:");
		if (!recursosDisponiveis.isEmpty()) {
			for (Recurso r : recursosDisponiveis) {
				System.out.println("   " + r.getNome());
			}
		}
	}

	public double custoRecursos() {
		double custo = 0;
		for (Recurso r : recursosAdicionados) {
			custo += r.getCusto();
		}
		return custo;
	}

	public void setView(FrameMenu view) {
		this.view = view;
		this.view.setVisible(false);
	}

	public void exit() {
		this.view.setVisible(true);
	}
}
