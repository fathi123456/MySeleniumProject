package testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLD {

	public static void main(String[] args) {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cap);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.cacert.org/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.linkText("S'inscrire"));
		element.click();

		//driver.quit();

	}

}
