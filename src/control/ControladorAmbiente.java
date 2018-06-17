package control;

import java.util.ArrayList;
import model.Ambiente;
import model.AmbienteDAO;

public class ControladorAmbiente {
	private static ControladorAmbiente instance = null;

	private ControladorAmbiente() {
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
	
	public Ambiente getAmb(String nome){
		return AmbienteDAO.getInstance().read(nome);
	}
}
