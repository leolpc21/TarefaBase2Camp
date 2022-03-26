package TarefaBase2Camp.pages;

import TarefaBase2Camp.bases.PageBase;
import org.openqa.selenium.By;

public class CriarProfile extends PageBase {

    By linkMyAccont = By.linkText("My Account");
    By linkProfiles = By.linkText("Profiles");
    By plataformInput = By.name("platform");
    By operatingSystemInput = By.name("os");
    By osVersion = By.name("os_build");
    By additionalDescriptionTextArea = By.name("description");
    By buttonAddProfileInput = By.xpath("//input[@value='Add Profile']");
    By profileSelect = By.name("profile_id");

    public void clicarNoLinkMyAccount() {
        click(linkMyAccont);
    }

    public void clicarNoLinkProfiles() {
        click(linkProfiles);
    }

    public void preencherPlatform(String platform) {
        sendKeys(plataformInput, platform);
    }

    public void preencherOperatingSystem(String os) {
        sendKeys(operatingSystemInput, os);
    }

    public void preencherOsVersion(String version) {
        sendKeys(osVersion, version);
    }

    public void preencherDescription(String description) {
        sendKeys(additionalDescriptionTextArea, description);
    }

    public void clicarButtonAddProfile(){
        click(buttonAddProfileInput);
    }

    public String retornaTextoProfile(){
        return getText(profileSelect);
    }
}
