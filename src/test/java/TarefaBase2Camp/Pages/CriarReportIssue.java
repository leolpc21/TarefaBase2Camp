package TarefaBase2Camp.Pages;

import TarefaBase2Camp.Bases.PageBase;
import org.openqa.selenium.By;

public class CriarReportIssue extends PageBase {

    By linkText = By.linkText("Report Issue");

    public void clicarNoLink(){
        click(linkText);
    }
}
