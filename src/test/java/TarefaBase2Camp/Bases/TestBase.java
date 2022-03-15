package TarefaBase2Camp.Bases;

import TarefaBase2Camp.GlobalParameters;
import TarefaBase2Camp.Utils.DriverUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TestBase {
    public TestBase() {
    }

    @BeforeClass
    public static void beforeSuite() {
        new GlobalParameters();
    }

    @Before
    public void beforeTest() {
        DriverUtils.createInstance();
        DriverUtils.INSTANCE.manage().window().maximize();
        DriverUtils.INSTANCE.navigate().to(GlobalParameters.URL_DEFAULT);
    }

    @After
    public void afterTest() {
        DriverUtils.quitInstace();
    }

    @AfterClass
    public static void afterSuite() {
    }
}