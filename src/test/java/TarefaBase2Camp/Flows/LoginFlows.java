package TarefaBase2Camp.Flows;

import TarefaBase2Camp.Pages.LoginPage;

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
