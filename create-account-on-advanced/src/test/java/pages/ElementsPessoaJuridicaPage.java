package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPessoaJuridicaPage {

    static WebDriver driver;

    public ElementsPessoaJuridicaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampoRazaoSocial(String razaoSocial) {
        WebElement companyName = driver.findElement(By.id("companyName"));
        companyName.sendKeys(razaoSocial);
    }

    public void preencherCampoDataAberturaDaEmpresa(String dataAbertudaDaEmpresa) {
        WebElement dateBirth = driver.findElement(By.id("date"));
        dateBirth.sendKeys(dataAbertudaDaEmpresa);
    }

    public void preencherCampoCnpj(String cnpj) {
        WebElement document = driver.findElement(By.id("document"));
        document.sendKeys(cnpj);
    }

}
