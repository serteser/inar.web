import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// https://InarAcademy:Fk160621.@test.inar-academy.com
//((JavascriptExecutor) webDriver).executeScript("window.open()"); a code use for opening a new tab
//
//		ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles()); a code use for choosing the tab that is wanted to close
//		webDriver.switchTo().window(tabs.get(1));
public class WebOrderChromeDriverTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
    }

    @Test
    void testSeleniumWebDriver() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        WebOrderLoginPage webOrderLoginPage = homePage.clickOnWebOrder();
        WebOrderHomePage webOrderHomePage = webOrderLoginPage.verifyLoginAccess("Inar", "Academy");
        OrderPage orderPage = webOrderHomePage.navigateToOrderPage();
        String actualTotalValue = orderPage.getTotalForSpecificInputs("TechGadget","1","20");
        orderPage.enterName("name");
        orderPage.enterStreet("street");
        orderPage.enterState("state");
        orderPage.enterCity("city");
        orderPage.enterZip("zip");
        Thread.sleep(8000);



    }

    @AfterEach
    void tearDown() throws InterruptedException {

        driver.quit();
        driver = null;
    }
}
