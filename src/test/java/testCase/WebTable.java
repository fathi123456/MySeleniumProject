package testCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Fathi");
        driver.findElement(By.cssSelector("*[id='lastName']")).sendKeys("Fathi");
        driver.findElement(By.cssSelector("input#userEmail")).sendKeys("selenium@gmail.com");
        List<WebElement> checkboxs = driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]"));
        checkboxs.get(0).click();
        
        driver.findElement(By.id("userNumber")).sendKeys("23548765");
	}
}
