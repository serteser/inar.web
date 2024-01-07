import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * 1. Open the browser and navigate to the URL 2. Click on webautomation link 3. Click on
 * Selectable button 4. Click on Serialize button 5. Click on Item 5 6. Verify that Item 5
 * is selected 7. Verify that "You've selected: #5" is displayed 8. Click on Item 6 9.
 * Verify that Item 6 is selected 10. Verify that "You've selected: #6" is displayed 11.
 * Click on Item 1, Item 3 by holding down the Ctrl key 12. Verify that Item 1, Item 3 are
 * selected 13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because
 * Item 6 is still selected) 14. Click on Item 1, Item2, Item 3 by holding mouse down and
 * dragging 15. Verify that Item 1, Item 2, Item 3 are selected 16. Verify that "You've
 * selected: #1 #2 #3" is displayed
 */
public class Competion extends HooksOfAli {

	String selectable = "//a[text()='Selectable']";

	String serialize = "//a[text()='Serialize']";

	String css = "#selectable-serialize > li";

	@Test
	public void webAutomation() {
		WebElement webAutomation = driver.findElement(By.linkText("Webautomation"));
		webAutomation.click();
		WebElement selectable = driver.findElement(By.xpath("//a[text()='Selectable']"));
		selectable.click();
		WebElement serialize = driver.findElement(By.xpath("//a[text()='Serialize']"));
		serialize.click();
		List<WebElement> itemList = driver.findElements(By.cssSelector(css));
		itemList.get(3).click();

		boolean isSelected4 = itemList.get(3).getAttribute("class").contains("ui-selected");
		Assertions.assertTrue(isSelected4, "good job");
		WebElement condition = driver.findElement(By.id("select-result"));
		assertEquals("#4", condition.getText());

		itemList.get(4).click();
		boolean isSelected5 = itemList.get(4).getAttribute("class").contains("ui-selected");
		Assertions.assertTrue(isSelected5, "good job");
		assertEquals("#5", condition.getText());
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL)
			.click(itemList.get(0))
			.click(itemList.get(2))
			.keyUp(Keys.CONTROL)
			.build()
			.perform();

		boolean isSelected1 = itemList.get(0).getAttribute("class").contains("ui-selected");

		boolean isSelected3 = itemList.get(2).getAttribute("class").contains("ui-selected");

		boolean isSelected6 = itemList.get(5).getAttribute("class").contains("ui-selected");

		Assertions.assertTrue(isSelected1, "good job");
		Assertions.assertTrue(isSelected3, "good job");
		Assertions.assertFalse(isSelected6, "good job");
		actions.clickAndHold(itemList.get(0))
			.moveToElement(itemList.get(1))
			.moveToElement(itemList.get(2))
			.release()
			.build()
			.perform();
		isSelected1 = itemList.get(0).getAttribute("class").contains("ui-selected");
		isSelected3 = itemList.get(2).getAttribute("class").contains("ui-selected");
		boolean isSelected2 = itemList.get(1).getAttribute("class").contains("ui-selected");
		Assertions.assertTrue(isSelected1, "good job");
		Assertions.assertTrue(isSelected2, "good job");
		Assertions.assertTrue(isSelected3, "good job");

		assertEquals("#1 #2 #3", condition.getText());

	}

}
