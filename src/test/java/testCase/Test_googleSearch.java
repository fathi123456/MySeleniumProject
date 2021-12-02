package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_googleSearch{

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://google.com");
	
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@name='q']")).sendKeys(" selenium");
	
	driver.findElement(By.name("btnK")).click();
	
	System.out.println("test succes");
		
}	
		
		
	

}
