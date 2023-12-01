package teste;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementsCommunsPage;
import pages.ElementsPessoaFisicaPage;

public class TesteCriacaoPessoaFisica {

    static WebDriver driver;
    static ElementsCommunsPage elementsCommunsPage;
    static ElementsPessoaFisicaPage elementsPessoaFisicaPage;

    @BeforeClass
    public static void setBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");
        driver.manage().window().maximize();
        elementsCommunsPage = new ElementsCommunsPage(driver);
        elementsPessoaFisicaPage = new ElementsPessoaFisicaPage(driver);
        elementsCommunsPage.acceptCookies();
    }

    @Test
    public void preencherPaginaCadastroPessoaFisica(){

    }

}
