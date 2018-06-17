package model;

public class Funcionario {
    private int login;
	private String nome;
    private String senha;
	
	public Funcionario() {
	}
	
	public Funcionario(int login, String nome, String senha) {
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void print(){
		System.out.println("--- Funcionario ---");
		System.out.println("login: "+this.login);
		System.out.println("nome: "+this.nome);
		System.out.println("senha: "+this.senha);
	}
}
