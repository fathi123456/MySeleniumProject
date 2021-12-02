package testCase;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumericCaptcha {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.nammregister.org.uk/test.asp");
		driver.manage().window().maximize();

		String str = JOptionPane.showInputDialog("Enter your captcha");

		WebElement element = driver.findElement(By.id("captchacode"));
		element.sendKeys(str);

	}

}
