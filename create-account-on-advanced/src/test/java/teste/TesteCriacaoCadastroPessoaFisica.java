package teste;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementsCommunsPage;
import pages.ElementsPessoaFisicaPage;

public class TesteCriacaoCadastroPessoaFisica {

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
        elementsCommunsPage.aceitarCookies();
    }

    @Test
    public void completarCadastroDePessoaFisica() {
        elementsCommunsPage.preencherCampoNome("Carlos");
        elementsCommunsPage.preencherCampoSobrenome("Silva");
        elementsPessoaFisicaPage.preencherCampoDataNascimento("05/04/2001");
        elementsPessoaFisicaPage.preencherCampoCpf("911.237.150-50");
        elementsCommunsPage.clicarNoBotaoESelecionarBrasil();
        elementsCommunsPage.preencherCampoDddENumeroTelefone("51", "967625188");
        elementsCommunsPage.preencherCampoEmail("nino4179@uorak.com@uorak.com");
        elementsCommunsPage.preencherCampoConfirmarEmail("nino4179@uorak.com@uorak.com");
        elementsCommunsPage.aceitarAutorizacaoLgpd();
        elementsCommunsPage.clicarNoBotaoCadastrar();
    }

    @Test
    public void tentativaDeCompletarCadastroDePessoaFisicaPassandoUmCpfInvalido() {
        elementsCommunsPage.preencherCampoNome("Roger");
        elementsCommunsPage.preencherCampoSobrenome("Ramos");
        elementsPessoaFisicaPage.preencherCampoDataNascimento("24/01/1997");
        elementsPessoaFisicaPage.preencherCampoCpf("000.000.000-000");
        elementsCommunsPage.clicarNoBotaoESelecionarBrasil();
        elementsCommunsPage.preencherCampoDddENumeroTelefone("51", "985774350");
        elementsCommunsPage.preencherCampoEmail("roxanna6987@uorak.com");
        elementsCommunsPage.preencherCampoConfirmarEmail("roxanna6987@uorak.com");
        elementsCommunsPage.aceitarAutorizacaoLgpd();
        elementsCommunsPage.clicarNoBotaoCadastrar();
    }

    @Test
    public void tentativaDeCompletarCadastroDePessoaFisicaPassandoUmEmailInvalido() {
        elementsCommunsPage.preencherCampoNome("Ricardo");
        elementsCommunsPage.preencherCampoSobrenome("Araújo");
        elementsPessoaFisicaPage.preencherCampoDataNascimento("10/09/2000");
        elementsPessoaFisicaPage.preencherCampoCpf("230.155.192-04");
        elementsCommunsPage.clicarNoBotaoESelecionarBrasil();
        elementsCommunsPage.preencherCampoDddENumeroTelefone("51", "975428385");
        elementsCommunsPage.preencherCampoEmail("gmail.com");
        elementsCommunsPage.preencherCampoConfirmarEmail("gmail.com");
        elementsCommunsPage.aceitarAutorizacaoLgpd();
        elementsCommunsPage.clicarNoBotaoCadastrar();
    }

}
