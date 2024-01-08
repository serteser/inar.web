package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

	private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<>();

	private Driver() {
		throw new UnsupportedOperationException("Can not instantiate ");
	}

	public synchronized static WebDriver getDriver() {

		if (DRIVER_THREAD_LOCAL.get() == null) {

			WebDriver driver;
			String browser = System.getProperty("browser", "chrome");

			driver = switch (browser.toLowerCase()) {
				case "firefox" -> new FirefoxDriver();
				case "edge" -> new EdgeDriver();
				default -> new ChromeDriver();
			};

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");

			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			if (browser.equalsIgnoreCase("firefox")) {
				driver.navigate().refresh();

				try {
					Thread.sleep(3000);
				}
				catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
			}

			DRIVER_THREAD_LOCAL.set(driver);
		}
		return DRIVER_THREAD_LOCAL.get();
	}

	public static void closeDriver() {

		WebDriver currentDriver = DRIVER_THREAD_LOCAL.get();
		if (currentDriver != null) {

			currentDriver.quit();
			DRIVER_THREAD_LOCAL.remove();
		}
	}

}
