package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class DeletarReportIssue extends PageBase {

    By myViewLinkText = By.linkText("My View");
    By reportedByMeLinkText = By.linkText("Reported by Me");

    public void clicarNoLinkMyView(){
        click(myViewLinkText);
    }
    public void clicarNoLinkReportedByMe(){
        click(reportedByMeLinkText);
    }

}
