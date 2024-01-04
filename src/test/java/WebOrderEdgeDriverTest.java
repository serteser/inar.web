import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://InarAcademy:Fk160621.@test.inar-academy.com
//((JavascriptExecutor) webDriver).executeScript("window.open()"); a code use for opening a new tab
//
//		ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles()); a code use for choosing the tab that is wanted to close
//		webDriver.switchTo().window(tabs.get(1));
public class WebOrderEdgeDriverTest {

	WebDriver webDriver;

	@BeforeEach
	void setUp() {

		webDriver = new EdgeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");
	}

	@Test
	void testSeleniumWebDriver() throws InterruptedException {

		WebElement webOrder = webDriver.findElement(By.xpath("//*[@id='navbar']/div/a[1]"));
		webOrder.click();

		WebElement userNameElement = webDriver.findElement(By.id("login-username-input"));
		userNameElement.sendKeys("Inar");

		WebElement passwordElement = webDriver.findElement(By.id("login-password-input"));
		passwordElement.sendKeys("Academy");

		WebElement loginButtonElement = webDriver.findElement(By.id("login-button"));
		loginButtonElement.click();

		Thread.sleep(4000);

		// WebElement welcomeHeading = webDriver.findElement(By.id("welcome-heading"));

		assertEquals("https://InarAcademy:Fk160621.@test.inar-academy.com/weborder", webDriver.getCurrentUrl());

	}

	@AfterEach
	void tearDown() throws InterruptedException {

		webDriver.quit();
		webDriver = null;
	}

}
