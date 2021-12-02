package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PHPtravelSign {
	WebDriver driver;

	@Test
	public void register_test_case() {
		driver.findElement(By.linkText("Signup")).click();
		driver.findElement(By.name("first_name")).sendKeys("fathi");
		driver.findElement(By.name("last_name")).sendKeys("fathi");
		driver.findElement(By.name("phone")).sendKeys("31524854");
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ilef123");
		driver.findElement(By.name("password")).sendKeys("ilef123");
		WebElement submitButton = driver.findElement(
				By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/button[1]"));
		JavascriptExecutor java = (JavascriptExecutor) driver;
		java.executeScript("scroll(0,1000)");
		submitButton.click();
	}

	@BeforeClass
	public void open_browser() {

		System.setProperty("webdriver.chrome.driver", "src/test/sources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@AfterClass
	public void tearDown() {
		// driver.close();

	}
}
