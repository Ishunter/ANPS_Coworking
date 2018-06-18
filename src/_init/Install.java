package _init;

import model.*;

public class Install {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/";

    static final String USER = "coworking";
    static final String PASS = "1234";

    public static void main(String[] args) {
        // Conectar no banco, se não conseguir encerrar.
        // Verificar se existem banco/tabelas senão existirem criar

        // Criar Banco
        // Criar Tabelas
        
        // Criar ADMIN
        //Gerente g = new Gerente(new Funcionario(0, "Admir", "1234"));
        //GerenteDAO.getInstance().create(g);

        // Gerando Banco Inicial
        /*
       FuncionarioDAO.getInstance().create("1234", "Lucas", "1234");
       FuncionarioDAO.getInstance().create("1111", "Nathan", "1111");
       FuncionarioDAO.getInstance().create("2222", "Isaac", "2222");
       
       Ambiente a = new Ambiente(100, "Descrição do ambiente 1", "Sala Oval", 10);
       AmbienteDAO.getInstance().create(a);
       a = new Ambiente(150, "Descrição do ambiente 2", "Sala Griffin", 20);
       AmbienteDAO.getInstance().create(a);
       a = new Ambiente(200, "Descrição do ambiente 3", "Sala Exclusiva", 5);
       AmbienteDAO.getInstance().create(a);
       
       Recurso r = new Recurso(10, "Lumens HD HDMI", "Datashow#001");
       RecursoDAO.getInstance().create(r);
       r = new Recurso(20, "Multimidia Filme HDMI", "Datashow#002");
       RecursoDAO.getInstance().create(r);
       r = new Recurso(30, "Dell 3200 dpi", "Mouse Wireless#003");
       RecursoDAO.getInstance().create(r);
       r = new Recurso(40, "Dual Core 4GB 500GB Tela Full HD 15.6 Windows 10", "Notebook Positivo#004");
       RecursoDAO.getInstance().create(r);
         
        
        ClienteDAO.getInstance().create(new Cliente("Estudante", "06875124920", "Rua X 666", false, 30, "Lucas Martins Petroski", ""));
        ClienteDAO.getInstance().create(new Cliente("Empresario", "01234567890", "Rua Trajano 99", false, 66, "Niek Naji", ""));
        ClienteDAO.getInstance().create(new Cliente("Abatedor", "95377459024", "Servidão da Paz", true, 19, "Kristopher Marcel", ""));
        */
        
    }

}
