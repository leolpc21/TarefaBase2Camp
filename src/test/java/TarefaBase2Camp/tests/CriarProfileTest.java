package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.CriarReportIssueFlows;
import TarefaBase2Camp.flows.DeletarReportIssueFlows;
import TarefaBase2Camp.flows.LoginFlows;
import org.junit.Test;

public class CriarProfileTest extends TestBase{
    LoginFlows loginFlows;
    CriarReportIssueFlows criarReportIssueFlows;
    DeletarReportIssueFlows deletarReportIssueFlows;

    @Test
    public void criarProfile() {
        loginFlows = new LoginFlows();
        criarReportIssueFlows = new CriarReportIssueFlows();
        deletarReportIssueFlows = new DeletarReportIssueFlows();
    }
}
