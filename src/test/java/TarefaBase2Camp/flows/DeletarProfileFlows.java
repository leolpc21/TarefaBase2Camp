package TarefaBase2Camp.flows;

import TarefaBase2Camp.pages.DeletarProfile;

public class DeletarProfileFlows {
    DeletarProfile deletarProfile;

    public DeletarProfileFlows() {
        deletarProfile = new DeletarProfile();
    }

    public void deletarProfile(String profile) {

        deletarProfile.clicarNoLinkMyAccount();
        deletarProfile.clicarNoLinkProfiles();
        deletarProfile.selecionarOption(profile);
        deletarProfile.clicarDeleteProfile();
        deletarProfile.clicarButtonSubmit();
    }
}