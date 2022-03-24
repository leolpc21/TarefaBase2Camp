package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.CriarReportIssueFlows;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.DeletarReportIssue;
import org.junit.Assert;
import org.junit.Test;

    public class DeletarReportIssueTest extends TestBase{
    LoginFlows loginFlows;
    CriarReportIssueFlows criarReportIssueFlows;
    DeletarReportIssue deletarReportIssue;

    @Test
    public void deletarReport() {
        loginFlows = new LoginFlows();
        criarReportIssueFlows = new CriarReportIssueFlows();
        deletarReportIssue = new DeletarReportIssue();

        String opcao = "Delete";

        loginFlows.efetuarLogin();
        criarReportIssueFlows.criarReport();
        String idIssue = deletarReportIssue.textoLinkText();
        deletarReportIssue.clicarNoLinkMyView();
        deletarReportIssue.clicarNoLinkReportedByMe();
        deletarReportIssue.clicarNoCheckboxIssue();
        deletarReportIssue.selecionarOption(opcao);
        deletarReportIssue.clicarNoButtonOk();
        deletarReportIssue.clicarNoButtonDeleteIssue();
        deletarReportIssue.clicarNoLinkMyView();
        deletarReportIssue.clicarNoLinkReportedByMe();

        Assert.assertFalse(deletarReportIssue.retornaTextoTabela().contains(idIssue));
    }
}
