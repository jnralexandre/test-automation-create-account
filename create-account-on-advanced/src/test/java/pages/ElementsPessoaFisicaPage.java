package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPessoaFisicaPage {

    static WebDriver driver;

    public ElementsPessoaFisicaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInFieldDateBirth(String dataNascimento) {
        WebElement dateBirth = driver.findElement(By.id("date"));
        dateBirth.sendKeys(dataNascimento);
    }

    public void fillInFieldCpf(String cpf) {
        WebElement document = driver.findElement(By.id("document"));
        document.sendKeys(cpf);
    }

}

