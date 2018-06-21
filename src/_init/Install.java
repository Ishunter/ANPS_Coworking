package _init;

import control.ControladorRecurso;
import control.exceptions.ExceptionCancelar;
import control.exceptions.ExceptionInput;
import control.exceptions.ExceptionSalvoComSucesso;
import model.*;

public class Install {

    public static void main(String[] args) {
        try {
            Gerente g = new Gerente(new Funcionario(0000, "Admir", "0000"));
            GerenteDAO.getInstance().create(g);

            FuncionarioDAO.getInstance().create("1111", "Lucas", "1111");
            FuncionarioDAO.getInstance().create("2222", "Nathan", "2222");
            FuncionarioDAO.getInstance().create("3333", "Isaac", "3333");

            Ambiente a = new Ambiente(100, "Descrição do ambiente 1", "Sala Oval", 10);
            AmbienteDAO.getInstance().create(a);
            a = new Ambiente(150, "Descrição do ambiente 2", "Sala Griffin", 20);
            AmbienteDAO.getInstance().create(a);
            a = new Ambiente(200, "Descrição do ambiente 3", "Sala Exclusiva", 5);
            AmbienteDAO.getInstance().create(a);

            ControladorRecurso.getInstance().salvar("Datashow", "10", "Lumens HD HDMI");
            ControladorRecurso.getInstance().salvar("Datashow", "20", "Multimidia Filme HDMI");
            ControladorRecurso.getInstance().salvar("Mouse Wireless", "11", "Dell 3200 dpi");
            ControladorRecurso.getInstance().salvar("Notebook Positivo", "50" ,"Dual Core 4GB 500GB Tela Full HD 15.6 Windows 10");

            ClienteDAO.getInstance().create(new Cliente("Estudante", "06875124920", "Rua X 666", false, 30, "Lucas Martins Petroski", ""));
            ClienteDAO.getInstance().create(new Cliente("Empresario", "01234567890", "Rua Trajano 99", false, 66, "Niek Naji", ""));
            ClienteDAO.getInstance().create(new Cliente("Abatedor", "95377459024", "Servidão da Paz", true, 19, "Kristopher Marcel", ""));
        } catch (ExceptionInput | ExceptionSalvoComSucesso | ExceptionCancelar ex) {

        }

    }

}
