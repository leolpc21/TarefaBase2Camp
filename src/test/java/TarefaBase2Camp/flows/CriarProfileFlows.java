package TarefaBase2Camp.flows;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.pages.CriarProfile;

public class CriarProfileFlows extends TestBase{
    CriarProfile criarprofile;

    public void criarProfile() {
        criarprofile = new CriarProfile();

        String platform = "PC";
        String os = "Windows";
        String osVersion = "2022";
        String description = "Descrição adicional do Profile";

        criarprofile.clicarNoLinkMyAccount();
        criarprofile.clicarNoLinkProfiles();
        criarprofile.preencherPlatform(platform);
        criarprofile.preencherOperatingSystem(os);
        criarprofile.preencherOsVersion(osVersion);
        criarprofile.preencherDescription(description);
        criarprofile.clicarButtonAddProfile();
    }
}
