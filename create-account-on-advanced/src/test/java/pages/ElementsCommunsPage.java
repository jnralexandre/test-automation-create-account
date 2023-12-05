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

    public void acceptCookies() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        WebElement buttonCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        buttonCookies.click();
    }

    public void clickOnTheIndividualButton() {
        WebElement individualButton = driver.findElement(By.id("PfButton"));
        individualButton.click();
    }

    public void clickOnTheLegalEntityButton() {
        WebElement legalEntityButton = driver.findElement(By.id("PjButton"));
        legalEntityButton.click();
    }

    public void fillInNameField(String nome) {
        WebElement firstName = driver.findElement(By.id("name"));
        firstName.sendKeys(nome);
    }

    public void fillInLastNameField(String sobrenome) {
        WebElement lastName = driver.findElement(By.id("lastname"));
        lastName.sendKeys(sobrenome);
    }

    public void clickOnTheDdiFieldButtonAndSelectBrazil() {
        WebElement choseADdi = driver.findElement(By.xpath("//div[@role=\"menu\"]/a[@id=\"ddi\"] "));
        choseADdi.click();
        WebElement country = driver.findElement(By.xpath("//a[contains(text(), \"Brasil - +55\")]"));
        country.click();
    }

    public void fillInDdiAndPhoneField(String ddd, String numeroTelefone) {
        WebElement dddPage = driver.findElement(By.id("ddd"));
        dddPage.sendKeys(ddd);
        WebElement phonePage = driver.findElement(By.id("phone"));
        phonePage.sendKeys(numeroTelefone);
    }

    public void fillInEmailField(String email) {
        WebElement emailPage = driver.findElement(By.id("email"));
        emailPage.sendKeys(email);
    }

    public void fillFieldConfirmEmail(String confEmail) {
        WebElement confEmailPage = driver.findElement(By.id("confEmail"));
        confEmailPage.sendKeys(confEmail);
    }

}
