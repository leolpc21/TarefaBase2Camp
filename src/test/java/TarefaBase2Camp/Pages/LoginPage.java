package TarefaBase2Camp.Pages;

import TarefaBase2Camp.Bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@type='submit']");
    By MessageSpanLogged = By.className("small");

    public void preencherUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }

    public String retornaMensagemLogin(){
        return getText(MessageSpanLogged);
    }
}
