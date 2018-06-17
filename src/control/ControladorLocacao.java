package control;

import control.exceptions.ExceptionInput;
import java.util.ArrayList;
import model.Locacao;
import model.LocacaoDAO;

public class ControladorLocacao {

	private static ControladorLocacao instance = null;

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
			array.add(l.getAmbiente().getNome()+ "#" + l.getCliente().getCpf());
		}
		return array;
	}

	public ArrayList<String> getLocacao(String str) {
		ArrayList<String> array = new ArrayList<>();
		String ambiente = str.substring(0, str.indexOf("#"));
		String cliente = str.substring(str.indexOf("#")+1, str.length());
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
	
	public void salvar(String dataFinal, String dataInicial, String qtdEstacoesLocadas, String funcionario, String cliente, String ambiente) throws ExceptionInput{
		// Check empty
		if (dataFinal.isEmpty() || dataInicial.isEmpty() || qtdEstacoesLocadas.isEmpty()) {
			throw new ExceptionInput("Por favor preencher campos.");
		}
		// Check Datas
		
		// Check estacoes
		
		// Check PK Cliente, Ambiente
		if (LocacaoDAO.getInstance().read(cliente, ambiente) == null){
			// nova locacao
			Locacao l = new Locacao();
			l.setDataFinal(dataFinal);
			l.setDataInicial(dataInicial);
			l.setFuncionario(ControladorFuncionario.getInstance().getFunc());
			l.setCliente(ControladorCliente.getInstance().getCli(cliente));
			l.setAmbiente(ControladorAmbiente.getInstance().getAmb(ambiente));
			l.setRecurso(ControladorRecurso.getInstance().salvarRlRecursos());
			LocacaoDAO.getInstance().create(l);
		} else {
			Locacao l = LocacaoDAO.getInstance().read(cliente, ambiente);
			l.setDataFinal(dataFinal);
			l.setDataInicial(dataInicial);
			l.setFuncionario(ControladorFuncionario.getInstance().getFunc());
			l.setCliente(ControladorCliente.getInstance().getCli(cliente));
			l.setAmbiente(ControladorAmbiente.getInstance().getAmb(ambiente));
			l.setRecurso(ControladorRecurso.getInstance().salvarRlRecursos());
			LocacaoDAO.getInstance().update(l);
		}
		
	}
}
