package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.CriarReportIssue;
import TarefaBase2Camp.utils.Utils;
import com.google.common.io.Resources;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.URL;
import java.util.Date;

public class CriarReportIssueTest extends TestBase {
    LoginFlows loginFlows;
    CriarReportIssue criarReportIssue;
    Utils utils;

    @Test
    public void criarReport(){

        loginFlows = new LoginFlows();
        criarReportIssue = new CriarReportIssue();
        utils = new Utils();

        String usuario = "leonardo.costa";
        String senha = "1648";
        String categoria = "[All Projects] General";
        String reprodutibilidade = "unable to reproduce";
        String gravidade = "major";
        String prioridade = "urgent";
        String perfil = "PC Windows 11";
        String atribuir = "leonardo.costa";
        Date dataAtual = new Date();
        String campoTitulo = "Titulo teste " + utils.getNowDate(dataAtual);
        String campoDescricao = "Campo de descrição do problema.";
        String campoReproducao = "Campo de descrição para reprodução do problema.";
        String campoAdicionalInfo = "Campo de descrição para informação adicional.";
        // caminhoArquivo = "resources/files/anexoExemploB2.jpg";

        // filePath = "anexoExemploB2.jpg";
        //URL resource = Resources.getResource(filePath);
        //String uploadFullPath = resource.toURI().getPath();

        loginFlows.efetuarLogin(usuario,senha);
        criarReportIssue.clicarNoLink();
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
        //criarReportIssue.adicionarFile(caminhoArquivo);

    }
}
