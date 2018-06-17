package model;

public class Gerente extends Funcionario {

	public Gerente(Funcionario funcionario) {
		super(funcionario.getLogin(),funcionario.getNome(),funcionario.getSenha());
	}
    
	public void print(){
		System.out.println("--- Gerente ---");
		System.out.println("login: "+this.getLogin());
		System.out.println("nome: "+this.getNome());
		System.out.println("senha: "+this.getSenha());
	}
}
