package model;

public class Ambiente {
	private double custo;
	private String descricao;
	private String nome;
	private int qtdEstacoesTrabalho;

    public Ambiente() {
    }

    public Ambiente(double custo, String descricao, String nome, int qtdEstacoesTrabalho) {
        this.custo = custo;
        this.descricao = descricao;
        this.nome = nome;
        this.qtdEstacoesTrabalho = qtdEstacoesTrabalho;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstacoesTrabalho() {
        return qtdEstacoesTrabalho;
    }

    public void setQtdEstacoesTrabalho(int qtdEstacoesTrabalho) {
        this.qtdEstacoesTrabalho = qtdEstacoesTrabalho;
    }
        
	public void print(){
		System.out.println("--- Ambiente ---");
		System.out.println("custo: "+this.custo);
		System.out.println("descricao: "+this.descricao);
		System.out.println("nome: "+this.nome);
		System.out.println("qtdEstacoesTrabalho: "+this.qtdEstacoesTrabalho);
	}
    
}
