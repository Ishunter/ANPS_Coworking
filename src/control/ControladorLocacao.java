package control;

import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Locacao;
import model.LocacaoDAO;
import view.FrameMenu;

public class ControladorLocacao {

    private static ControladorLocacao instance = null;
    private FrameMenu view;

    private ControladorLocacao() {
    }

    public static ControladorLocacao getInstance() {
        if (instance == null) {
            instance = new ControladorLocacao();
        }
        return instance;
    }

    public ArrayList<String> getAllLocacoes() {
        ArrayList<String> array = new ArrayList<>();
        for (Locacao l : LocacaoDAO.getInstance().getAll()) {
            array.add(l.getAmbiente().getNome() + "#" + l.getCliente().getCpf());
        }
        return array;
    }

    public ArrayList<String> getLocacao(String str) {
        ArrayList<String> array = new ArrayList<>();
        String ambiente = str.substring(0, str.indexOf("#"));
        String cliente = str.substring(str.indexOf("#") + 1, str.length());
        Locacao l = LocacaoDAO.getInstance().read(cliente, ambiente);
        if (l != null) {
            array.add(l.getDataFinal());
            array.add(l.getDataInicial());
            array.add(Integer.toString(l.getQtdEstacoesLocadas()));
            array.add(Double.toString(l.getAmbiente().getCusto()));
            array.add(l.getFuncionario().getNome());
            array.add(cliente);
            array.add(ambiente);
        }
        return array;
    }

    public void salvar(String dataFinal, String dataInicial, String qtdEstacoesLocadas, String funcionario, String cliente, String ambiente) throws ExceptionInput, ExceptionCancelar, ExceptionSalvoComSucesso {
        // Check empty
        if (dataFinal.isEmpty() || dataInicial.isEmpty() || qtdEstacoesLocadas.isEmpty()) {
            throw new ExceptionInput("Por favor preencher campos.");
        }
        // Check Datas
        if (!checkDate(dataFinal)) {
            throw new ExceptionInput("Data Final Invalida.");
        }
        if (!checkDate(dataInicial)) {
            throw new ExceptionInput("Data Inicial Invalida.");
        }

        String[] inicial = dataInicial.split("/");
        String[] fina = dataFinal.split("/");
        LocalDate ini = LocalDate.of(Integer.valueOf(inicial[2]), Integer.valueOf(inicial[1]), Integer.valueOf(inicial[0]));
        LocalDate fim = LocalDate.of(Integer.valueOf(fina[2]), Integer.valueOf(fina[1]), Integer.valueOf(fina[0]));

        if (fim.isBefore(ini)) {
            throw new ExceptionInput("Data Final deve ser posterior ou igual a Data Inicial.");
        }
        // Check estacoes
        if (Integer.valueOf(qtdEstacoesLocadas) <= 0) {
            throw new ExceptionInput("Quantidade de estações tem que ser maior que 0.");
        }
        if (ControladorAmbiente.getInstance().getAmb(ambiente).getQtdEstacoesTrabalho()
            - this.estacoesLocadas(ambiente) - Integer.valueOf(qtdEstacoesLocadas) < 0) {
            throw new ExceptionInput("Quantidade de estações maior do que a disponivel.");
        }
        // Check PK Cliente, Ambiente
        {
            if (LocacaoDAO.getInstance().read(cliente, ambiente) == null) {
                // nova locacao
                Locacao l = new Locacao();
                l.setDataFinal(dataFinal);
                l.setDataInicial(dataInicial);
                l.setQtdEstacoesLocadas(Integer.valueOf(qtdEstacoesLocadas));
                l.setFuncionario(ControladorFuncionario.getInstance().getFuncionarioLogado());
                l.setCliente(ControladorCliente.getInstance().getCli(cliente));
                l.setAmbiente(ControladorAmbiente.getInstance().getAmb(ambiente));
                l.setRecurso(ControladorRecurso.getInstance().salvarRlRecursos());
                LocacaoDAO.getInstance().create(l);
            } else {
                boolean atualizarDados = CtrlUtil.getInstance().PanelYesOrNo(
                    "Já existe uma Locacao com este Ambiente para este Cliente.\nDeseja atualizar os dados?",
                    "Deseja atualizar os dados?");
                if (atualizarDados) {
                    Locacao l = LocacaoDAO.getInstance().read(cliente, ambiente);
                    l.setDataFinal(dataFinal);
                    l.setDataInicial(dataInicial);
                    l.setQtdEstacoesLocadas(Integer.valueOf(qtdEstacoesLocadas));
                    l.setFuncionario(ControladorFuncionario.getInstance().getFuncionarioLogado());
                    l.setCliente(ControladorCliente.getInstance().getCli(cliente));
                    l.setAmbiente(ControladorAmbiente.getInstance().getAmb(ambiente));
                    l.setRecurso(ControladorRecurso.getInstance().salvarRlRecursos());
                    LocacaoDAO.getInstance().update(l);
                    throw new ExceptionSalvoComSucesso("Locacao");
                } else {
                    throw new ExceptionCancelar();
                }

            }
        }

    }

    private boolean checkDate(String date) {
        return date.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
    }

    public void setView(FrameMenu view) {
        this.view = view;
        this.view.setVisible(false);
    }

    public void exit() {
        this.view.setVisible(true);
    }

    public int estacoesLocadas(String ambiente) {
        int qtd = 0;
        ArrayList<Locacao> locacoes = LocacaoDAO.getInstance().getAll();
        if (locacoes != null) {
            for (Locacao l : locacoes) {
                if (l.getAmbiente().getNome().equals(ambiente)) {
                    qtd += l.getQtdEstacoesLocadas();
                }
            }
        }
        return qtd;
    }

    public boolean estaLocado(String recurso) {
        return LocacaoDAO.getInstance().RlRecursosEstaLocado(recurso);
    }
}
