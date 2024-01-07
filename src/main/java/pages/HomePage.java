package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    // States
    private WebDriver driver;
    private By webOrderLink = By.linkText("Weborder");
    private By webAutomationLink = By.linkText("Webautomation");
    private By targetMarketLink = By.linkText("Target Market");
    private By bookingLink = By.linkText("Booking");
    private By handlingCertificationsLink = By.linkText("Handling Certifications");
    private By fileUploadingLink = By.linkText("File Uploading");
    private By exploreInarTestingWorldTitleText = By.cssSelector(".display-1.text-fifth");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Actions (Behaviors)
    public WebOrderLoginPage clickOnWebOrder() {
        driver.findElement(webOrderLink).click();
        return new WebOrderLoginPage(driver);
    }

    public void clickOnWebAutomation() {
        driver.findElement(webAutomationLink).click();

    }

    public void clickOnTargetMarketLink() {
        driver.findElement(targetMarketLink).click();
    }

    public void clickOnBookingLink() {
        driver.findElement(bookingLink).click();
    }

    public void clickOnHandlingCertificationsLink() {
        driver.findElement(handlingCertificationsLink).click();
    }

    public void clickOnFileUploadingLink() {
        driver.findElement(fileUploadingLink).click();
    }

    public String getExploreInarTestingWorldTitleText() {
        return driver.findElement(exploreInarTestingWorldTitleText).getText();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

}
