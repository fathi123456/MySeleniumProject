package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calandrier {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
   WebDriver driver = new ChromeDriver();
   
   driver.get("https://www.expedia.com/");
   driver.manage().window().maximize();
   
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
   WebElement date = driver.findElement(By.cssSelector("#d1-btn"));
   
 
   JavascriptExecutor js = ((JavascriptExecutor) driver);
   js.executeScript("argument[0].setAttribute('value', '"+"29-11-2021"+"')",date);
   
   
   
   
	}

}
