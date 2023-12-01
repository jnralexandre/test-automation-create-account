package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;



public class ElementsCommunsPage {

    static WebDriver driver;

    public ElementsCommunsPage(WebDriver driver) {
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

}
