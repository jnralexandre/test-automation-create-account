package br.org.fundatec.tests;

import br.org.fundatec.pages.TesteCriacaoContaPessoal;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    static WebDriver driver;
    static TesteCriacaoContaPessoal testeCriacaoContaPessoal;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://www.google.com/search?q%3DGmail%26oq%3DGmail%26gs_lcrp%3DEgZjaHJvbWUyBggAEEUYOdIBBzc1MGowajGoAgCwAgA%26sourceid%3Dchrome%26ie%3DUTF-8&dsh=S-1727976308:1700870531783006&ec=GAlAAQ&flowEntry=SignUp&flowName=GlifWebSignIn&hl=pt-BR&theme=glif&TL=AHNYTIQc-VvdwIyLsmIzw0pOB9hs0ibFHkubN93lrN5WQqodZBBEIJ4FR7ytpguG");

        testeCriacaoContaPessoal = new TesteCriacaoContaPessoal(driver);
    }

    @Test
    public void test() {
        testeCriacaoContaPessoal.fillInTheNameField();
        testeCriacaoContaPessoal.fillInTheLastNameField();
        testeCriacaoContaPessoal.clickButtonNext();
    }

//    @AfterClass
//    public void tearDownAfterClass() throws Exception {
//    }

}
