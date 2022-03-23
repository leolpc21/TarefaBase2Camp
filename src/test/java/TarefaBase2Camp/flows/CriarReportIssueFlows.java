package TarefaBase2Camp.flows;

import TarefaBase2Camp.pages.CriarReportIssue;
import TarefaBase2Camp.utils.Utils;
import java.util.Date;

public class CriarReportIssueFlows {
    CriarReportIssue criarReportIssue;

    public CriarReportIssueFlows(){
        criarReportIssue = new CriarReportIssue();
    }

    public void criarReport(){
        Utils utils = new Utils();
        Date dataAtual = new Date();

        String categoria = "[All Projects] General";
        String reprodutibilidade = "unable to reproduce";
        String gravidade = "major";
        String prioridade = "urgent";
        String perfil = "PC Windows 11";
        String atribuir = "leonardo.costa";
        String campoTitulo = "Titulo teste " + utils.getNowDate(dataAtual);
        String campoDescricao = "Campo de descrição do problema.";
        String campoReproducao = "Campo de descrição para reprodução do problema.";
        String campoAdicionalInfo = "Campo de descrição para informação adicional.";
        String caminhoArquivo = "/src/test/resources/files/anexoExemploB2.jpg";

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
    }
}
