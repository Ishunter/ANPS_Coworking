package _init;

import java.util.ArrayList;
import model.*;

public class Coworking {

    public static void main(String[] args) {
		ArrayList<Recurso> recurso = new ArrayList<>();
		/*
		Recurso r1 = RecursoDAO.getInstance().read("rec#0001");
		Recurso r2 = RecursoDAO.getInstance().read("rec#0002");
		
		recurso.add(r1);
		recurso.add(r2);
	
		Funcionario f0 = GerenteDAO.getInstance().read(0);
		Funcionario f1 = FuncionarioDAO.getInstance().read(1);
		Funcionario f2 = FuncionarioDAO.getInstance().read(2);
				
		Ambiente a1 = AmbienteDAO.getInstance().read("ambiente 1");
		Ambiente a2 = AmbienteDAO.getInstance().read("ambiente 2");
		
		Cliente c1 = ClienteDAO.getInstance().read("cpf");
		Cliente c2 = ClienteDAO.getInstance().read("06875124920");
		*/
		
		//recurso = new ArrayList<>();
		//Locacao l1 = new Locacao("27/10/2018", "25/10/2018", 1, recurso, f0, c1, a1);
		//list(l1);
		
		//LocacaoDAO.getInstance().create(l1);
		//LocacaoDAO.getInstance().update(l1);
		Locacao l1 = LocacaoDAO.getInstance().read("cpf", "ambiente 1");
		
		list(l1);
    }
	
	public static void list(Locacao l1){
		System.out.println("DI:"+l1.getDataInicial()
			+"\nDF:"+l1.getDataFinal()
			+"\n"+l1.getCliente().getCpf()
			+"\n"+l1.getAmbiente().getNome()
			+"\n"+l1.getFuncionario().getNome());
		ArrayList<Recurso> array = l1.getRecurso();
		for(Recurso a : array){
			System.out.println(a.getNome() +" "+a.getCusto());
		}
	}
}
