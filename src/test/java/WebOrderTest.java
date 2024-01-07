import org.junit.jupiter.api.Test;
import pages.*;
import utils.Driver;

// https://InarAcademy:Fk160621.@test.inar-academy.com
//((JavascriptExecutor) webDriver).executeScript("window.open()"); a code use for opening a new tab
//
//		ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles()); a code use for choosing the tab that is wanted to close
//		webDriver.switchTo().window(tabs.get(1));
public class WebOrderTest extends HooksOfHamza {

	@Test
	void testSeleniumWebDriver() throws InterruptedException {

		Driver.getDriver().manage().window().maximize();

		HomePage homePage = new HomePage();

		homePage.clickOnWebOrder();

		WebOrderLoginPage webOrderLoginPage = new WebOrderLoginPage();

		webOrderLoginPage.verifyLoginAccess("Inar", "Academy");

		WebOrderHomePage webOrderHomePage = new WebOrderHomePage();

		webOrderHomePage.navigateToOrderPage();

		OrderPage orderPage = new OrderPage();

		String actualTotalValue = orderPage.getTotalForSpecificInputs("TechGadget", "1", "20");
		orderPage.enterName("name");
		orderPage.enterStreet("street");
		orderPage.enterState("state");
		orderPage.enterCity("city");
		orderPage.enterZip("zip");
		Thread.sleep(2000);
	}

}
