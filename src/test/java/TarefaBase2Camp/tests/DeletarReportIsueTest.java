package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.CriarReportIssueFlows;
import TarefaBase2Camp.flows.LoginFlows;
import org.junit.Test;

public class DeletarReportIsueTest extends TestBase{
    LoginFlows loginFlows;
    CriarReportIssueFlows criarReportIssueFlows;

    @Test
    public void deletarReport() {
        loginFlows = new LoginFlows();
        criarReportIssueFlows = new CriarReportIssueFlows();

        loginFlows.efetuarLogin();
        criarReportIssueFlows.criarReport();
    }
}
