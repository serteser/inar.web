package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebOrderHomePage extends BasePage {

	@FindBy(linkText = "View all orders")
	private WebElement viewAllOrdersLink;

	@FindBy(linkText = "View all products")
	private WebElement viewAllProductsLink;

	@FindBy(linkText = "Order")
	private WebElement orderLink;

	public WebOrderHomePage() {
		super();

	}

	public void navigateToViewAllOrdersPage() {
		viewAllOrdersLink.click();

	}

	public void navigateToViewAllProductsPage() {
		viewAllProductsLink.click();
	}

	public void navigateToOrderPage() {
		orderLink.click();

	}

}
