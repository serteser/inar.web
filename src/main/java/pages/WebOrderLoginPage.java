package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebOrderLoginPage extends BasePage {

	@FindBy(id = "login-username-input")
	private WebElement userNameInputField;

	@FindBy(id = "login-password-input")
	private WebElement passwordInputField;

	@FindBy(id = "login-button")
	private WebElement loginButton;

	public WebOrderLoginPage() {
		super();
	}

	public void enterUserName(String userName) {
		userNameInputField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordInputField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public void verifyLoginAccess(String userName, String password) {
		enterUserName(userName);
		enterPassword(password);
		clickOnLoginButton();
	}

}
