package TarefaBase2Camp.flows;

import TarefaBase2Camp.pages.LoginPage;

public class LoginFlows {
    LoginPage loginPage;

    public LoginFlows(){
        loginPage = new LoginPage();
    }

    public void efetuarLogin(String usuario, String senha){
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();
    }
}
