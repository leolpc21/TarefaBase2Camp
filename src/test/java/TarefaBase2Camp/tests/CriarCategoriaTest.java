package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.CriarCategoria;
import org.junit.Test;

public class CriarCategoriaTest extends TestBase {
    LoginFlows loginFlows;
    CriarCategoria criarCategoria;

    @Test
    public void criarCategoria(){
        loginFlows = new LoginFlows();
        criarCategoria = new CriarCategoria();

        String senha = "1648";
        String nameCategoria = "Teste Leonardo";

        loginFlows.efetuarLogin();
        criarCategoria.preencherPassword(senha);
        criarCategoria.clicarButtonSubmit();
        criarCategoria.clicarNoLinkManageProjects();
        criarCategoria.preencherName(nameCategoria);
        criarCategoria.clicarButtonAddCategory();
    }
}
