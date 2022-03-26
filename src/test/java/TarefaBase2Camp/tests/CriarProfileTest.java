package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.DeletarProfileFlows;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.CriarProfile;
import org.junit.Assert;
import org.junit.Test;

public class CriarProfileTest extends TestBase{
    LoginFlows loginFlows;
    CriarProfile criarprofile;
    DeletarProfileFlows deletarProfileFlows;

    @Test
    public void criarProfile() {
        loginFlows = new LoginFlows();
        criarprofile = new CriarProfile();
        deletarProfileFlows = new DeletarProfileFlows();

        String platform = "PC";
        String os = "Windows";
        String osVersion = "2022";
        String description = "Descrição adicional do Profile";
        String profile = platform + " " + os + " " + osVersion;

        loginFlows.efetuarLogin();
        criarprofile.clicarNoLinkMyAccount();
        criarprofile.clicarNoLinkProfiles();
        criarprofile.preencherPlatform(platform);
        criarprofile.preencherOperatingSystem(os);
        criarprofile.preencherOsVersion(osVersion);
        criarprofile.preencherDescription(description);
        criarprofile.clicarButtonAddProfile();

        Assert.assertTrue(criarprofile.retornaTextoProfile().contains(profile));

        deletarProfileFlows.deletarProfile(profile);
    }
}
