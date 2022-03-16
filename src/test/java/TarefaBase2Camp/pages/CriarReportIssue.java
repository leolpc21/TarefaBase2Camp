package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class CriarReportIssue extends PageBase {

    By linkText = By.linkText("Report Issue");
    By categorySelect = By.name("category_id");
    By reproducibilitySelect = By.name("reproducibility");
    By severitySelect = By.name("severity");
    By prioritySelect = By.name("priority");
    By profileSelect = By.name("profile_id");
    By handlerSelect = By.name("handler_id");
    By summaryInput = By.name("summary");
    By descriptionTextArea = By.name("description");
    By reproduceTextArea = By.name("steps_to_reproduce");
    By additionalInfoTextArea = By.name("additional_info");
    By fileInput = By.id("ufile[]");

    public void clicarNoLink(){
        click(linkText);
    }

    public void selecionarCategory(String categoria){
        comboBoxSelectByVisibleText(categorySelect, categoria);
    }

    public void selecionarSeverity(String gravidade){
        comboBoxSelectByVisibleText(severitySelect, gravidade);
    }

    public void selecionarReproducibility(String reprodutibilidade){
        comboBoxSelectByVisibleText(reproducibilitySelect, reprodutibilidade);
    }

    public void selecionarPriority(String prioridade){
        comboBoxSelectByVisibleText(prioritySelect, prioridade);
    }

    public void selecionarProfile(String perfil){
        comboBoxSelectByVisibleText(profileSelect, perfil);
    }

    public void selecionarHandler(String atribuir){
        comboBoxSelectByVisibleText(handlerSelect, atribuir);
    }

    public void preencherSummary(String titulo){
        sendKeys(summaryInput, titulo);
    }

    public void preencherDescription(String descricao){
        sendKeys(descriptionTextArea, descricao);
    }

    public void preencherStepsToReproduce(String descricaoReproducao){
        sendKeys(reproduceTextArea, descricaoReproducao);
    }

    public void preencherAdditionalInfo(String infoAdicional){
        sendKeys(additionalInfoTextArea, infoAdicional);
    }

    public void adicionarFile(String adicionarArquivo){
        sendKeys(fileInput, adicionarArquivo);
    }


}
