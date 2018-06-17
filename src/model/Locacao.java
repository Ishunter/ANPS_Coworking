package model;

import java.util.ArrayList;

public class Locacao {

    private String dataFinal;
    private String dataInicial;
    private int qtdEstacoesLocadas;
    private ArrayList<Recurso> recurso;
    private Funcionario funcionario;
    private Cliente cliente;
    private Ambiente ambiente;

    public Locacao() {
    }

    public Locacao(String dataFinal, String dataInicial, int qtdEstacoesLocadas, ArrayList<Recurso> recurso, Funcionario funcionario, Cliente cliente, Ambiente ambiente) {
        this.dataFinal = dataFinal;
        this.dataInicial = dataInicial;
        this.qtdEstacoesLocadas = qtdEstacoesLocadas;
        this.recurso = recurso;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.ambiente = ambiente;
    }

    public Locacao(String dataFinal, String dataInicial, int qtdEstacoesLocadas) {
        this.dataFinal = dataFinal;
        this.dataInicial = dataInicial;
        this.qtdEstacoesLocadas = qtdEstacoesLocadas;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public int getQtdEstacoesLocadas() {
        return qtdEstacoesLocadas;
    }

    public void setQtdEstacoesLocadas(int qtdEstacoesLocadas) {
        this.qtdEstacoesLocadas = qtdEstacoesLocadas;
    }

    public ArrayList<Recurso> getRecurso() {
        return recurso;
    }

    public void setRecurso(ArrayList<Recurso> recurso) {
        this.recurso = recurso;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }
    
    public void print(){
		System.out.println("--- Locacao ---");
		System.out.println("dataFinal: "+this.dataFinal);
		System.out.println("dataInicial: "+this.dataInicial);
		System.out.println("qtdEstacoesLocadas "+this.qtdEstacoesLocadas);
		recurso.forEach((r) -> {
			r.print();
		});
		funcionario.print();
		cliente.print();
		ambiente.print();
		System.out.println("--- FIM Locacao ---");
	}
}
