package TarefaBase2Camp.Tests;

import TarefaBase2Camp.Bases.PageBase;
import TarefaBase2Camp.Bases.TestBase;
import TarefaBase2Camp.Flows.LoginFlows;
import TarefaBase2Camp.Pages.CriarReportIssue;
import org.junit.Test;

public class CriarReportIssueTest extends TestBase {
    LoginFlows loginFlows;
    CriarReportIssue criarReportIssue;

    @Test
    public void criarReport(){

        loginFlows = new LoginFlows();
        criarReportIssue = new CriarReportIssue();

        String usuario = "leonardo.costa";
        String senha = "1648";

        loginFlows.efetuarLogin(usuario,senha);
        criarReportIssue.clicarNoLink();

    }


}
