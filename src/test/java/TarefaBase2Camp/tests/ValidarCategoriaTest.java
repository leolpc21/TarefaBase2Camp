package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.ValidarCategoria;
import org.junit.Assert;
import org.junit.Test;

public class ValidarCategoriaTest extends TestBase {
    LoginFlows loginFlows;
    ValidarCategoria validarCategoria;

    @Test
    public void validarCategoria(){
        loginFlows = new LoginFlows();
        validarCategoria = new ValidarCategoria();

        String nameCategoria = "Teste Leonardo";
        String mensagemEsperada = "A category with that name already exists.";

        loginFlows.efetuarLogin();
        validarCategoria.clicarNoLinkManage();
        validarCategoria.clicarNoLinkManageProjects();
        validarCategoria.preencherName(nameCategoria);
        validarCategoria.clicarButtonAddCategory();

        Assert.assertTrue(validarCategoria.retornaTextoErro().contains(mensagemEsperada));
    }
}
