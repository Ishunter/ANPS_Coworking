package control;

import control.exceptions.ExceptionInput;
import model.Funcionario;
import view.FrameLogin;

public class ControladorLogin {
    
    private static ControladorLogin instance = null;
    private FrameLogin view;
    
    private ControladorLogin() {
    }

    public static ControladorLogin getInstance() {
        if (instance == null) {
            instance = new ControladorLogin();
        }
        return instance;
    }

    public void login(String login, String senha) throws ExceptionInput {
        Funcionario funcionario = ControladorFuncionario.getInstance().getFuncionario(login);

        // Check login
        if (funcionario == null) {
            throw new ExceptionInput("Login invalido.");
        }

        // Check senha
        if (!senha.equals(funcionario.getSenha())) {
            throw new ExceptionInput("Senha não confere.");
        }
        
        ControladorFuncionario.getInstance().setFuncionarioLogado(Integer.valueOf(login));
    }
    
    public void deslogar(){
        ControladorFuncionario.getInstance().setFuncionarioLogado(-1);
        view.setVisible(true);
    }

    public void setLogin(FrameLogin view) {
        this.view = view;
        this.view.setVisible(false);
    }    
}
