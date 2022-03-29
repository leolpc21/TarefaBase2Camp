package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.CriarReportIssueFlows;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.EditarReportIssue;
import TarefaBase2Camp.utils.Utils;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class EditarReportIssueTest extends TestBase{
    LoginFlows loginFlows;
    CriarReportIssueFlows criarReportIssueFlows;
    EditarReportIssue editarReportIssue;

    @Test
    public void editarReport() {
        loginFlows = new LoginFlows();
        criarReportIssueFlows = new CriarReportIssueFlows();
        editarReportIssue = new EditarReportIssue();
        Utils utils = new Utils();
        Date dataAtual = new Date();

        //Necessário que tenha o Profile "PC Windows 11";
        String status = "confirmed";
        String resolution = "won't fix";
        String campoTitulo = "Titulo Editado teste " + utils.getNowDate(dataAtual);
        String campoDescricao = "Campo de descrição do problema \nEditado.";
        String campoAdicionarNota = "Campo Notes adicionada na edição do Report";
        String nomeArquivo = "anexoExemplo.PNG";
        String caminhoArquivo = "/src/test/resources/files/" + nomeArquivo;

        loginFlows.efetuarLogin();
        criarReportIssueFlows.criarReport();
        editarReportIssue.clicarNaImagemLapis();
        editarReportIssue.selecionarStatus(status);
        editarReportIssue.selecionarResolution(resolution);
        editarReportIssue.clearSummary();
        editarReportIssue.preencherSummary(campoTitulo);
        editarReportIssue.clearDescription();
        editarReportIssue.preencherDescription(campoDescricao);
        editarReportIssue.preencherAddNote(campoAdicionarNota);
        editarReportIssue.clicarButtonUpdate();
        editarReportIssue.adicionarFile(caminhoArquivo);
        editarReportIssue.clicarButtonUploadFile();

        Assert.assertTrue(editarReportIssue.retornaTextoHistory().contains(campoTitulo));
        Assert.assertTrue(editarReportIssue.retornaTextoHistory().contains(nomeArquivo));
    }
}
