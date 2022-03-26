package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class DeletarProfile extends PageBase {

    By linkMyAccont = By.linkText("My Account");
    By linkProfiles = By.linkText("Profiles");
    By profileSelect = By.name("profile_id");
    By deleteProfileInput = By.xpath("//input[@value='delete']");
    By buttonSubmitInput = By.xpath("//input[@value='Submit']");

    public void clicarNoLinkMyAccount() {
        click(linkMyAccont);
    }

    public void clicarNoLinkProfiles() {
        click(linkProfiles);
    }

    public void selecionarOption(String opcao){
        comboBoxSelectByVisibleText(profileSelect, opcao);
    }

    public void clicarDeleteProfile(){
        click(deleteProfileInput);
    }

    public void clicarButtonSubmit(){
        click(buttonSubmitInput);
    }
}
