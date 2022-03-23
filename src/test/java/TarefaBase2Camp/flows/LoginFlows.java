package TarefaBase2Camp.flows;

import TarefaBase2Camp.pages.LoginPage;

public class LoginFlows {
    LoginPage loginPage;

    public LoginFlows(){
        loginPage = new LoginPage();
    }

    public void efetuarLogin(){
        String usuario = "leonardo.costa";
        String senha = "1648";

        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
    }
}
