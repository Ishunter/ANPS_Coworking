package model;

public class Gerente extends Funcionario {

	public Gerente(Funcionario funcionario) {
		super(funcionario.getLogin(),funcionario.getNome(),funcionario.getSenha());
	}
    
}
