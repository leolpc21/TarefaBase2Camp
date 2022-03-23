package TarefaBase2Camp.flows;

import TarefaBase2Camp.pages.DeletarReportIssue;

public class DeletarReportIssueFlows {
    DeletarReportIssue deletarReportIssue;

    public DeletarReportIssueFlows(){
        deletarReportIssue = new DeletarReportIssue();
    }

    public void deletarReport() {
        String opcao = "Delete";

        deletarReportIssue.clicarNoLinkMyView();
        deletarReportIssue.clicarNoLinkReportedByMe();
        deletarReportIssue.clicarNoCheckboxIssue();
        deletarReportIssue.selecionarOption(opcao);
        deletarReportIssue.clicarNoButtonOk();
        deletarReportIssue.clicarNoButtonDeleteIssue();
    }
}
