package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewAllProductsPage {
    private WebDriver driver;
    private By viewAllProductsPageLink = By.linkText("View all products");

    public ViewAllProductsPage(WebDriver driver) {
        this.driver = driver;
    }

public void clickOnViewAllProductsPage(){
        driver.findElement(viewAllProductsPageLink).click();
}




}
