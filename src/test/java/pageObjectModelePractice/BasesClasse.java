package pageObjectModelePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasesClasse {

	static WebDriver driver;

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "src/test/sources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");

		driver.manage().window().maximize();

	}

	public static WebDriver getWebDriver() {
		return driver;
	}
}
