package control;

public class ControladorLocacao {

	private static ControladorLocacao instance = null;

	private ControladorLocacao() {
	}

	public static ControladorLocacao getInstance() {
		if (instance == null) {
			instance = new ControladorLocacao();
		}
		return instance;
	}

}
