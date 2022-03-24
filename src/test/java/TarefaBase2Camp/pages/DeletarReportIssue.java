package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class DeletarReportIssue extends PageBase {

    By partialLinkText = By.partialLinkText("View Submitted Issue");
    By myViewLinkText = By.linkText("My View");
    By reportedByMeLinkText = By.linkText("Reported by Me");
    By checkboxInput = By.xpath("//input[@type='checkbox']");
    By optionSelect = By.name("action");
    By okButton = By.className("button");
    By deleteIssueButton = By.className("button");
    By textoTable = By.id("buglist");

    public String textoLinkText(){
        return getPartialText(partialLinkText);
    }

    public void clicarNoLinkMyView(){
        click(myViewLinkText);
    }

    public void clicarNoLinkReportedByMe(){
        click(reportedByMeLinkText);
    }

    public void clicarNoCheckboxIssue(){
        click(checkboxInput);
    }

    public void selecionarOption(String opcao){
        comboBoxSelectByVisibleText(optionSelect, opcao);
    }

    public void clicarNoButtonOk(){
        click(okButton);
    }

    public void clicarNoButtonDeleteIssue(){
        click(deleteIssueButton);
    }

    public String retornaTextoTabela(){
        return getText(textoTable);
    }
}
