package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class ValidarCadastroDuplicadoCategoria extends PageBase {

    By linkManageText = By.linkText("Manage");
    By linkManageProjectsText = By.linkText("Manage Projects");
    By nameInput = By.name("name");
    By buttonAddCategoryInput = By.xpath("//input[@value='Add Category']");
    By textoApplicationErro = By.xpath("//table//tr//td//p");

    public void clicarNoLinkManage(){
        click(linkManageText);
    }

    public void clicarNoLinkManageProjects(){
        click(linkManageProjectsText);
    }

    public void preencherName(String name){
        sendKeys(nameInput,name);
    }

    public void clicarButtonAddCategory(){
        click(buttonAddCategoryInput);
    }

    public String retornaTextoErro(){
        return getText(textoApplicationErro);
    }
}
