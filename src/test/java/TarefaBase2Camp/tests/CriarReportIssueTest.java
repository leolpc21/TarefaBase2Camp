package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.CriarProfileFlows;
import TarefaBase2Camp.flows.DeletarProfileFlows;
import TarefaBase2Camp.flows.DeletarReportIssueFlows;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.CriarReportIssue;
import TarefaBase2Camp.utils.Utils;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class CriarReportIssueTest extends TestBase{
    LoginFlows loginFlows;
    CriarReportIssue criarReportIssue;
    CriarProfileFlows criarProfileFlows;
    DeletarProfileFlows deletarProfileFlows;
    DeletarReportIssueFlows deletarReportIssueFlows;
    Utils utils;

    @Test
    public void criarReport(){
        loginFlows = new LoginFlows();
        criarReportIssue = new CriarReportIssue();
        criarProfileFlows = new CriarProfileFlows();
        deletarProfileFlows = new DeletarProfileFlows();
        deletarReportIssueFlows = new DeletarReportIssueFlows();
        utils = new Utils();
        Date dataAtual = new Date();

        String categoria = "[All Projects] Teste Leonardo";
        String reprodutibilidade = "unable to reproduce";
        String gravidade = "major";
        String prioridade = "urgent";
        String perfil = "PC Windows 2022";
        String atribuir = "leonardo.costa";
        String campoTitulo = "Titulo teste " + utils.getNowDate(dataAtual);
        String campoDescricao = "Campo de descrição do problema.";
        String campoReproducao = "Campo de descrição para reprodução do problema.";
        String campoAdicionalInfo = "Campo de descrição para informação adicional.";
        String caminhoArquivo = "/src/test/resources/files/anexoExemploB2.jpg";

        loginFlows.efetuarLogin();
        criarProfileFlows.criarProfile();
        criarReportIssue.clicarNoLinkReportIssue();
        criarReportIssue.selecionarCategory(categoria);
        criarReportIssue.selecionarReproducibility(reprodutibilidade);
        criarReportIssue.selecionarSeverity(gravidade);
        criarReportIssue.selecionarPriority(prioridade);
        criarReportIssue.selecionarProfile(perfil);
        criarReportIssue.selecionarHandler(atribuir);
        criarReportIssue.preencherSummary(campoTitulo);
        criarReportIssue.preencherDescription(campoDescricao);
        criarReportIssue.preencherStepsToReproduce(campoReproducao);
        criarReportIssue.preencherAdditionalInfo(campoAdicionalInfo);
        criarReportIssue.adicionarFile(caminhoArquivo);
        criarReportIssue.clicarStatusPrivate();
        criarReportIssue.clicarButtonSubmit();

        Assert.assertTrue(criarReportIssue.retornaTextoSucesso().contains("Operation successful."));

        deletarProfileFlows.deletarProfile(perfil);
        deletarReportIssueFlows.deletarReport();
    }
}
