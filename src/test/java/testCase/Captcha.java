package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Captcha {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("ebcaptchatext"));
		String str = element.getText();
		String s1 = str.substring(8, 9);
		String s2 = str.substring(12, 13);

		Integer i1 = Integer.valueOf(s1);
		Integer i2 = Integer.valueOf(s2);
		System.out.println(" nbr1: " + i1 + " nbr2: " + i2);

		Integer i = i1 + i2;
		element = driver.findElement(By.id("ebcaptchainput"));
		String ans = String.valueOf(i);
		element.sendKeys(ans);

		element = driver.findElement(By.xpath("//input[@type='submit']"));
		element.click();
		

	}

}
