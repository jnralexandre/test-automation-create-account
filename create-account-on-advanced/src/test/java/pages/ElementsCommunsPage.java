package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;


public class ElementsCommunsPage {

    static WebDriver driver;

    public ElementsCommunsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void aceitarCookies() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        WebElement buttonCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        buttonCookies.click();
    }

    public void clicarNoBotaoPessoaFisica() {
        WebElement individualButton = driver.findElement(By.id("PfButton"));
        individualButton.click();
    }

    public void clicarNoBotaoPessoaJuridica() {
        WebElement legalEntityButton = driver.findElement(By.id("PjButton"));
        legalEntityButton.click();
    }

    public void preencherCampoNome(String nome) {
        WebElement firstName = driver.findElement(By.id("name"));
        firstName.sendKeys(nome);
    }

    public void preencherCampoSobrenome(String sobrenome) {
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys(sobrenome);
    }

    public void clicarNoBotaoESelecionarBrasil() {
        WebElement choseADdi = driver.findElement(By.xpath("//div[@role=\"menu\"]/a[@id=\"ddi\"] "));
        choseADdi.click();
        WebElement country = driver.findElement(By.xpath("//a[contains(text(), \"Brasil - +55\")]"));
        country.click();
    }

    public void preencherCampoDddENumeroTelefone(String ddd, String numeroTelefone) {
        WebElement dddPage = driver.findElement(By.id("ddd"));
        dddPage.sendKeys(ddd);
        WebElement phonePage = driver.findElement(By.id("phone"));
        phonePage.sendKeys(numeroTelefone);
    }

    public void preencherCampoEmail(String email) {
        WebElement emailPage = driver.findElement(By.id("email"));
        emailPage.sendKeys(email);
    }

    public void preencherCampoConfirmarEmail(String confEmail) {
        WebElement confEmailPage = driver.findElement(By.id("confEmail"));
        confEmailPage.sendKeys(confEmail);
    }

    public void aceitarAutorizacaoLgpd(){
        WebElement checkboxLgpd = driver.findElement(By.xpath("//div[@Class=\"rs-checkbox-checker\"]/*[contains(text(), \"Autorizações Legais e LGPD\")]"));
        checkboxLgpd.click();
    }

    public void clicarNoBotaoCadastrar() {
        WebElement botaoCadastrar = driver.findElement(By.xpath("//*[contains(text(), \"Cadastrar\")]"));
        botaoCadastrar.click();
    }

}
