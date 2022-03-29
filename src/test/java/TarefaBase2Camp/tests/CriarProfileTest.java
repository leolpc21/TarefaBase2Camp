package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.CriarProfile;
import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class CriarProfileTest extends TestBase{
    LoginFlows loginFlows;
    CriarProfile criarprofile;

    @Test
    public void criarProfile() {
        loginFlows = new LoginFlows();
        criarprofile = new CriarProfile();
        Random randomGenerator  = new Random();
        int randomInt = randomGenerator.nextInt(1000);

        String platform = "PC";
        String os = "Windows";
        String osVersion = "2022." + randomInt;
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
    }
}
