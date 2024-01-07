package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public abstract class BasePage {

	WebDriver driver = Driver.getDriver();

	public BasePage() {

		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
