package teste;

import io.github.bonigarcia.wdm.WebDriverManager;
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
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");
        driver.manage().window().maximize();
        elementsCommunsPage = new ElementsCommunsPage(driver);
        elementsPessoaFisicaPage = new ElementsPessoaFisicaPage(driver);
        elementsCommunsPage.acceptCookies();
    }

    @Test
    public void completeTheIndividualRegistrationPage() {
        elementsCommunsPage.fillInNameField("Carlos");
        elementsCommunsPage.fillInLastNameField("Silva");
        elementsPessoaFisicaPage.fillInFieldDateBirth("09/09/2000");
        elementsPessoaFisicaPage.fillInFieldCpf("911.237.150-50");
        elementsCommunsPage.clickOnTheDdiFieldButtonAndSelectBrazil();
        elementsCommunsPage.fillInDdiAndPhoneField("51", "967625188");
        elementsCommunsPage.fillInEmailField("bertran4268@uorak.com");
        elementsCommunsPage.fillFieldConfirmEmail("bertran4268@uorak.com");
    }

}
