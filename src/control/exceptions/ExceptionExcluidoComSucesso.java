package control.exceptions;

public class ExceptionExcluidoComSucesso extends Exception {

	public ExceptionExcluidoComSucesso(String obj) {
		super(obj + " excluido com sucesso.");
	}

}
