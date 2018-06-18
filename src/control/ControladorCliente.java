package control;

import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import java.util.ArrayList;
import model.Cliente;
import model.ClienteDAO;
import view.FrameMenu;

public class ControladorCliente {

    private static ControladorCliente instance = null;
    private FrameMenu view;

    private ControladorCliente() {
    }

    public static ControladorCliente getInstance() {
        if (instance == null) {
            instance = new ControladorCliente();
        }
        return instance;
    }

    public void salvar(String Atividade, String cpf, String endereco, boolean estaInadimplente, int idade, String nome, String observacao) throws ExceptionInput, ExceptionSalvoComSucesso, ExceptionCancelar {
        // not null check
        if (nome.isEmpty()) {
            throw new ExceptionInput("Por favor preencher campos.");
        }
        // PK Check 
        if (isCpfInUse(cpf)) {
            boolean atualizarDados = CtrlUtil.getInstance().PanelYesOrNo(
                "Já existe um Cliente com este CPF.\nDeseja atualizar os dados?",
                "Deseja atualizar os dados?");
            if (atualizarDados) {
                ClienteDAO.getInstance().update(Atividade, cpf, endereco, estaInadimplente, idade, nome, observacao);
                throw new ExceptionSalvoComSucesso("Cliente");
            } else {
                throw new ExceptionCancelar();
            }
        } else {
            ClienteDAO.getInstance().create(Atividade, cpf, endereco, idade, nome, observacao);
            throw new ExceptionSalvoComSucesso("Funcionario");
        }
    }

    public ArrayList<Cliente> FiltrarPorNome(String nome) {
        return null;
    }

    public ArrayList<String> getAllClientesLocacao() {
        ArrayList<String> array = new ArrayList<>();
        for (Cliente c : ClienteDAO.getInstance().getAll()) {
            if (!c.isEstaInadimplente()) {
                array.add(c.getCpf() + "#" + c.getNome());
            }
        }
        return array;
    }

    public Cliente getCli(String cpf) {
        return ClienteDAO.getInstance().read(cpf);
    }

    public ArrayList<String> getAllClientes() {
        ArrayList<String> array = new ArrayList<>();
        for (Cliente c : ClienteDAO.getInstance().getAll()) {
            array.add(c.getCpf() + "#" + c.getNome());
        }
        return array;
    }
    
    public ArrayList<String> getClienteView(String cpf) {
        ArrayList<String> array = new ArrayList<>();
        Cliente c = ClienteDAO.getInstance().read(cpf);
        if (c != null) {
            array.add(c.getAtividade());
            array.add(c.getCpf());
            array.add(c.getEndereco());
            array.add(String.valueOf(c.isEstaInadimplente()));
            array.add(String.valueOf(c.getIdade()));
            array.add(c.getNome());
            array.add(c.getObservacao());            
        }
        return array;
    }
    
    public void setView(FrameMenu view) {
        this.view = view;
        this.view.setVisible(false);
    }

    public void exit() {
        this.view.setVisible(true);
    }
    
    public boolean isCpfInUse(String cpf){
        return ClienteDAO.getInstance().read(cpf) != null;
    }
}
