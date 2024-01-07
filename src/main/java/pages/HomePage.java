package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	// States
	@FindBy(linkText = "Weborder")
	private WebElement webOrderLink;

	@FindBy(linkText = "Webautomation")
	private WebElement webAutomationLink;

	@FindBy(linkText = "Target Market")
	private WebElement targetMarketLink;

	@FindBy(linkText = "Booking")
	private WebElement bookingLink;

	@FindBy(linkText = "Handling Certifications")
	private WebElement handlingCertificationsLink;

	@FindBy(linkText = "File Uploading")
	private WebElement fileUploadingLink;

	@FindBy(css = ".display-1.text-fifth")
	private WebElement exploreInarTestingWorldTitleText;

	// Constructor
	public HomePage() {
		super();
	}

	// Page Actions (Behaviors)
	public void clickOnWebOrder() {
		webOrderLink.click();
	}

	public void clickOnWebAutomation() {
		webAutomationLink.click();

	}

	public void clickOnTargetMarketLink() {
		targetMarketLink.click();
	}

	public void clickOnBookingLink() {
		bookingLink.click();
	}

	public void clickOnHandlingCertificationsLink() {
		handlingCertificationsLink.click();
	}

	public void clickOnFileUploadingLink() {
		fileUploadingLink.click();
	}

	public String getExploreInarTestingWorldTitleText() {
		return exploreInarTestingWorldTitleText.getText();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

}
