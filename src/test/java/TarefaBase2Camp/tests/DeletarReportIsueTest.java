package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.CriarReportIssueFlows;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.DeletarReportIssue;
import org.junit.Test;

public class DeletarReportIsueTest extends TestBase{
    LoginFlows loginFlows;
    CriarReportIssueFlows criarReportIssueFlows;
    DeletarReportIssue deletarReportIssue;

    @Test
    public void deletarReport() {
        loginFlows = new LoginFlows();
        criarReportIssueFlows = new CriarReportIssueFlows();
        deletarReportIssue = new DeletarReportIssue();

        loginFlows.efetuarLogin();
        criarReportIssueFlows.criarReport();
        deletarReportIssue.clicarNoLinkMyView();
        deletarReportIssue.clicarNoLinkReportedByMe();
    }
}
