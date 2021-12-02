package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProjetFirfox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com");

		// Get search box element from webElement 'q' using Find Element
		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("webdriver");

	}

}
