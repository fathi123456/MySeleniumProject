package com.prcticePage;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModelePractice.BasesClasse;
import pageObjectModelePractice.HomePage;
import pageObjectModelePractice.LoginPage;

public class PracticePage {
	WebDriver driver;

	@BeforeTest
	public void setup() {

		BasesClasse Bc = new BasesClasse();
		Bc.setup();

	}

	@Test(priority = 1)
	public void testLoginMissingPassword() {
		HomePage hp = new HomePage();
		hp.clickOnsignIn();

		LoginPage Lp = new LoginPage();
		Lp.login("iyyadilef123456789gmail.com", "ilef123");
		String actualResult = Lp.getErreurMassg();
		assertEquals(actualResult, "Authentication failed.");

	}

	@Test(priority = 2)
	public void testLoginWithInvalidEmail() throws InterruptedException {
		LoginPage Lp = new LoginPage();
		Lp.login("iyyadilef123456789gmail.com", "");

		Thread.sleep(2000);
		String actualResult = driver.findElement(By.id("create_account_error")).getText();
		assertEquals(actualResult, "Invalid email address.");
	}

	@AfterTest
	public void tearDown() {
		BasesClasse.getWebDriver().quit();
	}

}
