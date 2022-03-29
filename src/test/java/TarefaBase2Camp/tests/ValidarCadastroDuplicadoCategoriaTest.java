package TarefaBase2Camp.tests;

import TarefaBase2Camp.bases.TestBase;
import TarefaBase2Camp.flows.LoginFlows;
import TarefaBase2Camp.pages.ValidarCadastroDuplicadoCategoria;
import org.junit.Assert;
import org.junit.Test;

public class ValidarCadastroDuplicadoCategoriaTest extends TestBase {
    LoginFlows loginFlows;
    ValidarCadastroDuplicadoCategoria validarCadastroDuplicadoCategoria;

    @Test
    public void validarCadastroDuplicadoCategoriaCategoria(){
        loginFlows = new LoginFlows();
        validarCadastroDuplicadoCategoria = new ValidarCadastroDuplicadoCategoria();

        String nameCategoria = "Teste Leonardo";
        String mensagemEsperada = "A category with that name already exists.";

        loginFlows.efetuarLogin();
        validarCadastroDuplicadoCategoria.clicarNoLinkManage();
        validarCadastroDuplicadoCategoria.clicarNoLinkManageProjects();
        validarCadastroDuplicadoCategoria.preencherName(nameCategoria);
        validarCadastroDuplicadoCategoria.clicarButtonAddCategory();

        Assert.assertTrue(validarCadastroDuplicadoCategoria.retornaTextoErro().contains(mensagemEsperada));
    }
}
