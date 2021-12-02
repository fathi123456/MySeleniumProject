package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/sources/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/javascript4.htm");

		// types alertes box
		// alert box ; confirm box ; prompt box

		driver.findElement(By.xpath("//input[@value='alert box']")).click();

		String message = driver.switchTo().alert().getText();

		if (message.equals("This is an alert box!")) {
			System.out.println("pass");
		} else {
			System.out.println("failed");
		}

	}

}
