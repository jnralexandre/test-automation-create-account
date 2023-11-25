package br.org.fundatec.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TesteCriacaoContaPessoal {

    static WebDriver driver;

    public TesteCriacaoContaPessoal(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInTheNameField() {
        WebElement name = driver.findElement(By.id("firstName"));
        name.sendKeys("Eduardo");
    }

    public void fillInTheLastNameField() {
        WebElement lastLame = driver.findElement(By.id("lastName"));
        lastLame.sendKeys("Souza");
    }

    public void clickButtonNext() {
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'Próxima')]"));
        button.click();
    }

}
