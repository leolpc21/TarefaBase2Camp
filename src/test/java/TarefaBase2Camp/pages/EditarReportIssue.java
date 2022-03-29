package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class EditarReportIssue extends PageBase {
    
    By editLinkText = By.cssSelector("a[href^='bug_update_page.php?bug_id=']");
    By statusSelect = By.name("status");
    By resolutionSelect = By.name("resolution");
    By summaryInput = By.name("summary");
    By descriptionTextArea = By.name("description");
    By noteTextArea = By.name("bugnote_text");
    By buttonUpdateInformationInput = By.xpath("//input[@value='Update Information']");
    By textoIssueHistory = By.id("history_open");
    By fileInput = By.id("ufile[]");
    By buttonUploadFileInput = By.xpath("//input[@value='Upload File']");

    public void clicarNaImagemLapis(){
        click(editLinkText);
    }

    public void selecionarStatus(String status){
        comboBoxSelectByVisibleText(statusSelect, status);
    }

    public void selecionarResolution(String resolution){
        comboBoxSelectByVisibleText(resolutionSelect, resolution);
    }

    public void preencherSummary(String titulo){
        sendKeys(summaryInput, titulo);
    }

    public void preencherDescription(String descricao){
        sendKeys(descriptionTextArea, descricao);
    }

    public void preencherAddNote(String addNote){ sendKeys(noteTextArea, addNote);}

    public void clicarButtonUpdate(){
        click(buttonUpdateInformationInput);
    }

    public void clearSummary(){
        clear(summaryInput);
    }

    public void clearDescription(){
        clear(descriptionTextArea);
    }

    public String retornaTextoHistory(){
        return getText(textoIssueHistory);
    }

    public void adicionarFile(String adicionarArquivo) {
        String path = System.getProperty("user.dir");
        sendKeysUpload(fileInput, path + adicionarArquivo);
    }

    public void clicarButtonUploadFile(){
        click(buttonUploadFileInput);
    }
}
