package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllProductsPage extends BasePage {

	@FindBy(linkText = "View all products")
	private WebElement viewAllProductsPageLink;

	public ViewAllProductsPage() {
		super();
	}

	public void clickOnViewAllProductsPage() {
		viewAllProductsPageLink.click();
	}

}
