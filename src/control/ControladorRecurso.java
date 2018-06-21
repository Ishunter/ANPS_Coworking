package control;

import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionExcluidoComSucesso;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import model.Recurso;
import model.RecursoDAO;
import view.FrameMenu;

public class ControladorRecurso {

    private static ControladorRecurso instance = null;
    private ArrayList<Recurso> recursosAdicionados = new ArrayList<>();
    private ArrayList<Recurso> recursosDisponiveis = new ArrayList<>();
    private FrameMenu view;

    private ControladorRecurso() {
    }

    public static ControladorRecurso getInstance() {
        if (instance == null) {
            instance = new ControladorRecurso();
        }
        return instance;
    }

    public void loadRecursoLocacao(String cliente, String ambiente) {
        novaLocacao();
        for (Recurso r : RecursoDAO.getInstance().getAlocados(cliente, ambiente)) {
            this.recursosAdicionados.add(r);
        }
    }

    public void novaLocacao() {
        this.recursosAdicionados = new ArrayList<>();
        this.recursosDisponiveis = new ArrayList<>();

        for (Recurso r : RecursoDAO.getInstance().getDisponiveis()) {
            this.recursosDisponiveis.add(r);
        }
    }

    public ArrayList<String> getDisponiveis() {
        ArrayList<String> array = new ArrayList<>();
        if (this.recursosDisponiveis != null) {
            for (Recurso r : this.recursosDisponiveis) {
                array.add(r.getNome());
            }
        }
        return array;
    }

    public void addDisponiveis(String recurso) {
        Recurso r = RecursoDAO.getInstance().read(recurso);
        if (r != null) {
            for (Recurso rem : recursosAdicionados) {
                if (rem.getNome().equals(r.getNome())) {
                    recursosAdicionados.remove(rem);
                    break;
                }
            }
            this.recursosDisponiveis.add(r);
        }
    }

    public ArrayList<String> getAdicionados() {
        ArrayList<String> array = new ArrayList<>();
        if (this.recursosAdicionados != null) {
            for (Recurso r : this.recursosAdicionados) {
                array.add(r.getNome());
            }
        }
        return array;
    }

    public void addAdicionados(String recurso) {
        Recurso r = RecursoDAO.getInstance().read(recurso);
        if (r != null) {
            this.recursosAdicionados.add(r);
            for (Recurso rem : recursosDisponiveis) {
                if (rem.getNome().equals(r.getNome())) {
                    recursosDisponiveis.remove(rem);
                    break;
                }
            }
        }
    }

    public void salvar(String nome, String custo, String descricao) throws ExceptionInput, ExceptionSalvoComSucesso, ExceptionCancelar {
        List<Integer> itens = new LinkedList<>();

        // check null
        if (nome.isEmpty() || custo.isEmpty()) {
            throw new ExceptionInput("Por favor preencher campos.");
        }
        // check custo > 0
        if (Double.valueOf(custo) < 0) {
            throw new ExceptionInput("Custo deve ser maior que 0.");
        }

        // update?
        Recurso rec = RecursoDAO.getInstance().read(nome);
        if (rec != null) {
            boolean atualizarDados = CtrlUtil.getInstance().PanelYesOrNo(
                "Já existe um Recurso com este ID.\nDeseja atualizar os dados?",
                "Deseja atualizar os dados?");
            if (atualizarDados) {
                rec.setCusto(Double.valueOf(custo));
                rec.setDescricao(descricao);
                RecursoDAO.getInstance().update(rec);
                throw new ExceptionSalvoComSucesso("Recurso");
            } else {
                throw new ExceptionCancelar();
            }
        }

        // pega e ordena ids
        for (Recurso r : loadRecursos()) {
            String id = r.getNome().substring(r.getNome().indexOf("#")+1, r.getNome().length());
            itens.add(Integer.valueOf(id));
        }
        Collections.sort(itens);

        // add primeiro id disponivel
        for (int i = 0; i < itens.size(); i++) {
            if (!((i+1) == itens.get(i))) {
                RecursoDAO.getInstance().create(custo, descricao, nome + "#" + (i+1));
                throw new ExceptionSalvoComSucesso("Recurso");
            }
        }
        RecursoDAO.getInstance().create(custo, descricao, nome + "#" + (itens.size()+1));
        throw new ExceptionSalvoComSucesso("Recurso");
    }

    public void excluir(String nome) throws ExceptionInput, ExceptionExcluidoComSucesso {
        // check recurso existe
        if (RecursoDAO.getInstance().read(nome) == null) {
            throw new ExceptionInput("Recurso não encontrado.");
        }
        // chekc esta locado
        if (ControladorLocacao.getInstance().estaLocado(nome)) {
            throw new ExceptionInput("Não é possivel excluir um recurso locado.");
        }
        RecursoDAO.getInstance().delete(nome);
        throw new ExceptionExcluidoComSucesso("Recurso");
    }

    public ArrayList<Recurso> loadRecursos() {
        return RecursoDAO.getInstance().getAll();
    }

    public ArrayList<Recurso> salvarRlRecursos() {
        return recursosAdicionados;
    }

    public ArrayList<String> loadRecursosView() {
        ArrayList<String> array = new ArrayList<>();
        for (Recurso r : loadRecursos()) {
            array.add(r.getNome());
        }
        return array;
    }

    public double custoRecursos() {
        double custo = 0;
        for (Recurso r : recursosAdicionados) {
            custo += r.getCusto();
        }
        return custo;
    }

    public void setView(FrameMenu view) {
        this.view = view;
        this.view.setVisible(false);
    }

    public void exit() {
        this.view.setVisible(true);
    }

    public ArrayList<String> getRecursoView(String nome) {
        ArrayList<String> array = new ArrayList<>();
        Recurso r = RecursoDAO.getInstance().read(nome);
        array.add(String.valueOf(r.getCusto()));
        array.add(r.getDescricao());
        array.add(r.getNome());
        return array;
    }
}
