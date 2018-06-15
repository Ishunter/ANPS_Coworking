package model;

import java.util.ArrayList;
import java.util.Date;

public class Locacao {

    private Date dataFinal;
    private Date dataInicial;
    private int qtdEstacoesLocadas;
    private ArrayList<Recurso> recurso;
    private Funcionario funcionario;
    private Cliente cliente;
    private Ambiente ambiente;

    public Locacao() {
    }

    public Locacao(Date dataFinal, Date dataInicial, int qtdEstacoesLocadas, ArrayList<Recurso> recurso, Funcionario funcionario, Cliente cliente, Ambiente ambiente) {
        this.dataFinal = dataFinal;
        this.dataInicial = dataInicial;
        this.qtdEstacoesLocadas = qtdEstacoesLocadas;
        this.recurso = recurso;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.ambiente = ambiente;
    }

    public Locacao(Date dataFinal, Date dataInicial, int qtdEstacoesLocadas) {
        this.dataFinal = dataFinal;
        this.dataInicial = dataInicial;
        this.qtdEstacoesLocadas = qtdEstacoesLocadas;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
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
    
    
}
