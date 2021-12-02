package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {

	public static void main(String[] args) {
		
		System.setProperty( "webdriver.chrome.driver", "src/test/sources/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com");
		
		driver.manage().window().maximize();
		
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		Actions action = new Actions(driver);
		action.moveToElement(fashion).contextClick().build().perform();
		
		
		

	}

}
