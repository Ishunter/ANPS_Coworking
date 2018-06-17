package model;

public class Cliente {

    private String Atividade;
    private String cpf;
    private String endereco;
    private boolean estaInadimplente;
    private int idade;
    private String nome;
    private String observacao;

    public Cliente() {
    }

    public Cliente(String Atividade, String cpf, String endereco, boolean estaInadimplente, int idade, String nome, String observacao) {
        this.Atividade = Atividade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estaInadimplente = estaInadimplente;
        this.idade = idade;
        this.nome = nome;
        this.observacao = observacao;
    }

    public String getAtividade() {
        return Atividade;
    }

    public void setAtividade(String Atividade) {
        this.Atividade = Atividade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isEstaInadimplente() {
        return estaInadimplente;
    }

    public void setEstaInadimplente(boolean estaInadimplente) {
        this.estaInadimplente = estaInadimplente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

	public void print(){
		System.out.println("--- Cliente ---");
		System.out.println("Atividade: "+this.Atividade);
		System.out.println("cpf: "+this.cpf);
		System.out.println("endereco: "+this.endereco);
		System.out.println("estaInadimplente: "+this.estaInadimplente);
		System.out.println("idade: "+this.idade);
		System.out.println("nome: "+this.nome);
		System.out.println("observacao "+this.observacao);
		
	}
}
