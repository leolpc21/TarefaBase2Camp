package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class CriarCategoria extends PageBase {
    By passwordInput = By.name("password");
    By buttonSubmitInput = By.xpath("//input[@value='Login']");
    By linkManageProjectsText = By.linkText("Manage Projects");
    By nameInput = By.name("name");
    By buttonAddCategoryInput = By.xpath("//input[@value='Add Category']");

    public void preencherPassword(String senha){
        sendKeys(passwordInput,senha);
    }

    public void clicarButtonSubmit(){
        click(buttonSubmitInput);
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
}
