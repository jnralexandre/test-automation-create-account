package teste;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementsCommunsPage;
import pages.ElementsPessoaJuridicaPage;

public class TesteCriacaoCadastroPessoaJuridica {

    static WebDriver driver;
    static ElementsCommunsPage elementsCommunsPage;
    static ElementsPessoaJuridicaPage elementsPessoaJuridicaPage;

    @BeforeClass
    public static void setBeforeClass() throws Exception {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.get("https://cliente.advancedcorretora.com.br/signup");
        driver.manage().window().maximize();
        elementsCommunsPage = new ElementsCommunsPage(driver);
        elementsPessoaJuridicaPage = new ElementsPessoaJuridicaPage(driver);
        elementsCommunsPage.aceitarCookies();
    }

//    @Test
//    public void completarCadastroDePessoaJuridica() {
//        elementsCommunsPage.clicarNoBotaoPessoaJuridica();
//        elementsCommunsPage.preencherCampoNome("Elaine");
//        elementsCommunsPage.preencherCampoSobrenome("Rosa");
//        elementsPessoaJuridicaPage.preencherCampoRazaoSocial("Elaine e Maria Pizzaria Ltda");
//        elementsPessoaJuridicaPage.preencherCampoDataAberturaDaEmpresa("06/07/2022");
//        elementsPessoaJuridicaPage.preencherCampoCnpj("22.275.574/0001-05");
//        elementsCommunsPage.clicarNoBotaoESelecionarBrasil();
//        elementsCommunsPage.preencherCampoDddENumeroTelefone("99", "995983520");
//        elementsCommunsPage.preencherCampoEmail("damien6172@uorak.com");
//        elementsCommunsPage.preencherCampoConfirmarEmail("damien6172@uorak.com");
//        elementsCommunsPage.aceitarAutorizacaoLgpd();
//        elementsCommunsPage.clicarNoBotaoCadastrar();
//    }

    @Test
    public void tentativaDeCompletarCadastroDePessoaJuridicaPassandoUmCnpjInvalido() {
        elementsCommunsPage.clicarNoBotaoPessoaJuridica();
        elementsCommunsPage.preencherCampoNome("John");
        elementsCommunsPage.preencherCampoSobrenome("Pereira");
        elementsPessoaJuridicaPage.preencherCampoRazaoSocial("Perfumaria do John");
        elementsPessoaJuridicaPage.preencherCampoDataAberturaDaEmpresa("01/03/2022");
        elementsPessoaJuridicaPage.preencherCampoCnpj("99.99.999/99-20");
        elementsCommunsPage.clicarNoBotaoESelecionarBrasil();
        elementsCommunsPage.preencherCampoDddENumeroTelefone("53", "979083454");
        elementsCommunsPage.preencherCampoEmail("florinel1787@uorak.com");
        elementsCommunsPage.preencherCampoConfirmarEmail("florinel1787@uorak.com");
        elementsCommunsPage.aceitarAutorizacaoLgpd();
        elementsCommunsPage.clicarNoBotaoCadastrar();
    }

}
