package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage {

	@FindBy(id = "productSelect")
	private WebElement productDropDownMenu;

	@FindBy(id = "quantityInput")
	private WebElement quantityInputField;

	@FindBy(id = "discountInput")
	private WebElement discountInputField;

	@FindBy(id = "totalInput")
	private WebElement totalInputField;

	@FindBy(xpath = "//button[text()='Calculate']")
	private WebElement calculateButton;

	@FindBy(id = "name")
	private WebElement nameInputField;

	@FindBy(id = "street")
	private WebElement streetInputField;

	@FindBy(id = "city")
	private WebElement cityInputField;

	@FindBy(id = "state")
	private WebElement stateInputField;

	@FindBy(id = "zip")
	private WebElement zipInputField;

	@FindBy(id = "visa")
	private WebElement visaCheckRadioButton;

	@FindBy(id = "mastercard")
	private WebElement masterCardCheckRadioButton;

	@FindBy(id = "amex")
	private WebElement amexCheckRadioButton;

	@FindBy(id = "cardNumber")
	private WebElement cardNumberInutField;

	@FindBy(id = "expiryDate")
	private WebElement expireDateInutField;

	@FindBy(xpath = "//button[contains(text(),'Process')]")
	private WebElement processButton;

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	private WebElement resetButton;

	public OrderPage() {
		super();
	}

	public void selectProduct(String productName) {

		Select productDropDown = new Select(productDropDownMenu);
		productDropDown.selectByVisibleText(productName);
	}

	public void enterQuantity(String quantity) {

		quantityInputField.clear();
		quantityInputField.sendKeys(quantity);
	}

	public void enterDiscount(String discount) {

		discountInputField.clear();
		discountInputField.sendKeys(discount);
	}

	public String getTotal() {

		return totalInputField.getAttribute("value");
	}

	public void clickOnCalculateButton() {

		calculateButton.click();
	}

	public String getTotalForSpecificInputs(String productName, String quantity, String discount) {

		selectProduct(productName);
		enterQuantity(quantity);
		enterDiscount(discount);
		clickOnCalculateButton();
		return getTotal();

	}

	public void enterName(String name) {

		nameInputField.clear();
		nameInputField.sendKeys(name);
	}

	public void enterStreet(String street) {

		streetInputField.clear();
		streetInputField.sendKeys(street);
	}

	public void enterCity(String city) {

		cityInputField.clear();
		cityInputField.sendKeys(city);
	}

	public void enterState(String state) {

		stateInputField.clear();
		stateInputField.sendKeys(state);
	}

	public void enterZip(String zip) {

		zipInputField.clear();
		zipInputField.sendKeys(zip);
	}

	public boolean isVisaCheckRadioButtonSelected() {
		return visaCheckRadioButton.isSelected();

	}

	public boolean isMasterCardCheckRadioButtonSelected() {
		return masterCardCheckRadioButton.isSelected();

	}

	public boolean isAmexCheckRadioButtonSelected() {
		return amexCheckRadioButton.isSelected();

	}

	public void clickVisaCheckRadioButton() {
		visaCheckRadioButton.click();

	}

	public void clickMasterCardCheckRadioButton() {
		masterCardCheckRadioButton.click();

	}

	public void clickAmexCheckRadioButton() {
		amexCheckRadioButton.click();

	}

	public void enterCustomerInfo(String name, String street, String city, String state, String zip) {
		enterName(name);
		enterStreet(street);
		enterCity(city);
		enterState(state);
		enterZip(zip);
	}

}
