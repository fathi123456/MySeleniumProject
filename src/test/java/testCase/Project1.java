package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "src/test/sources/Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://tn.tunisiebooking.com/");
	
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//*[@id='ville_des']")).sendKeys("Tunis");
	//driver.findElement(By.xpath("//*[@class='select_destination_moteur_home']")).sendKeys("Tunis");
	driver.findElement(By.cssSelector("select[name='ville']")).sendKeys("Tunis");

	
	

	}

}
