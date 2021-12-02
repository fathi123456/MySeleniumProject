package testCase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();

		String expectedTitle = "Sign";
		WebElement element = driver.findElement(By.xpath("//a[@href='https://classic.freecrm.com/register/']"));
		String actualTitle = element.getText();

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("both Titles are same");

		} else {
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(f, new File("screenShot" + "xyz.jpeg"));

		}

	}

}
