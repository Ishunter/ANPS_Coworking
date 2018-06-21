package model;

public class Recurso {

    private double custo;
    private String descricao;
    private String nome;

    public Recurso() {
    }

    public Recurso(double custo, String descricao, String nome) {
        this.custo = custo;
        this.descricao = descricao;
        this.nome = nome;
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

    public void print() {
        System.out.println("--- Recurso ---");
        System.out.println("custo: " + this.custo);
        System.out.println("descricao: " + this.descricao);
        System.out.println("nome: " + this.nome);
    }
}
