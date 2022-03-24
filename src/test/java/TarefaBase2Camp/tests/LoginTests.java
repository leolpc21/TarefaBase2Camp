package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

    public class LoginTests extends TestBase {
    LoginPage loginPage;

    @Test
    public void efetuarLogin(){

        loginPage = new LoginPage();

        String usuario = "leonardo.costa";
        String senha = "1648";
        String mensagemEsperada = "(Leonardo Pereira Costa - manager)";

        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.retornaMensagemLogin().contains(mensagemEsperada));
    }
}
