package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {
    private WebDriver driver;
    private By productDropDownMenu = By.id("productSelect");
    private By quantityInputField = By.id("quantityInput");
    private By discountInputField = By.id("discountInput");
    private By totalInputField = By.id("totalInput");
    private By calculateButton = By.xpath("//button[text()='Calculate']");
    private By nameInputField = By.id("name");
    private By streetInputField = By.id("street");
    private By cityInputField = By.id("city");
    private By stateInputField = By.id("state");
    private By zipInputField = By.id("zip");


    private By visaCheckRadioButton = By.id("visa");
    private By masterCardCheckRadioButton = By.id("mastercard");
    private By amexCheckRadioButton = By.id("amex");
    private By cardNumberInutField = By.id("cardNumber");
    private By expireDateInutField = By.id("expiryDate");
    private By processButton = By.xpath("//button[contains(text(),'Process')]");
    private By resetButton = By.xpath("//button[contains(text(),'Reset')]");


    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct(String productName) {

        WebElement dropDownElements = driver.findElement(productDropDownMenu);
        Select productDropDown = new Select(dropDownElements);
        productDropDown.selectByVisibleText(productName);
    }

    public void enterQuantity(String quantity) {

        WebElement quantityElement = driver.findElement(quantityInputField);
        quantityElement.clear();
        quantityElement.sendKeys(quantity);
    }

    public void enterDiscount(String discount) {

        WebElement discountElement = driver.findElement(discountInputField);
        discountElement.clear();
        discountElement.sendKeys(discount);
    }

    public String getTotal() {

        return driver.findElement(totalInputField).getAttribute("value");
    }

    public void clickOnCalculateButton() {

        driver.findElement(calculateButton).click();
    }

    public String getTotalForSpecificInputs(String productName, String quantity, String discount) {

        selectProduct(productName);
        enterQuantity(quantity);
        enterDiscount(discount);
        clickOnCalculateButton();
        return getTotal();

    }

    public void enterName(String name) {

        WebElement nameElement = driver.findElement(nameInputField);
        nameElement.clear();
        nameElement.sendKeys(name);
    }

    public void enterStreet(String street) {

        WebElement streetElement = driver.findElement(streetInputField);
        streetElement.clear();
        streetElement.sendKeys(street);
    }

    public void enterCity(String city) {

        WebElement cityElement = driver.findElement(cityInputField);
        cityElement.clear();
        cityElement.sendKeys(city);
    }

    public void enterState(String state) {

        WebElement stateElement = driver.findElement(stateInputField);
        stateElement.clear();
        stateElement.sendKeys(state);
    }

    public void enterZip(String zip) {

        WebElement zipElement = driver.findElement(zipInputField);
        zipElement.clear();
        zipElement.sendKeys(zip);
    }

    public boolean isVisaCheckRadioButtonSelected() {
        return driver.findElement(visaCheckRadioButton).isSelected();

    }

    public boolean isMasterCardCheckRadioButtonSelected() {
        return driver.findElement(masterCardCheckRadioButton).isSelected();

    }

    public boolean isAmexCheckRadioButtonSelected() {
        return driver.findElement(amexCheckRadioButton).isSelected();

    }

    public void clickVisaCheckRadioButton() {
        driver.findElement(visaCheckRadioButton).click();

    }

    public void clickMasterCardCheckRadioButton() {
        driver.findElement(masterCardCheckRadioButton).click();

    }

    public void clickAmexCheckRadioButton() {
        driver.findElement(amexCheckRadioButton).click();

    }

    public void enterCustomerInfo(String name, String street, String city, String state, String zip) {
        enterName(name);
        enterStreet(street);
        enterCity(city);
        enterState(state);
        enterZip(zip);
    }


}

