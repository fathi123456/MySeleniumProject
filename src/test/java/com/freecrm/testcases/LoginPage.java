package com.freecrm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;

	@BeforeMethod

	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void titleTest() {

		String expectedResult = "CRMPRO - CRM software for customer relationship management, sales, and support.";
		String actualResult = driver.getTitle();
		System.out.println(actualResult);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test(priority = 2)

	public void urlCheck() {

		String expectedResult = "https://classic.crmpro.com/index.html";
		String actualResult = driver.getCurrentUrl();
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test(priority = 3)
	public void logoTest() {

		WebElement logo = driver.findElement(By.xpath("//img[@src='https://classic.freecrm.com/img/logo.png']"));
		boolean expectedResult = true;
		boolean actualResult = logo.isDisplayed();

		System.out.println(actualResult);
		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test(priority = 4)
	public void loginTest() {

		WebElement loginTextBox = driver.findElement(By.name("username"));
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		loginTextBox.sendKeys("ilef123456");
		passwordTextBox.sendKeys("ilef123456");
		loginButton.click();

		String expectedResult = "Free CRM - CRM software for customer relationship management, sales, and support.";
		String actualResult = driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult);

	}

}
