package pageObjectModelePractice;

import org.openqa.selenium.By;

public class LoginPage {
	
	public void login(String username,String password) {
		
		
		BasesClasse.getWebDriver().findElement(By.id("email")).sendKeys("username");
		BasesClasse.getWebDriver().findElement(By.id("passwd")).sendKeys("password");
		BasesClasse.getWebDriver().findElement(By.name("SubmitLogin")).click();
		
	}
  public String getErreurMassg() {
	  
	return BasesClasse.getWebDriver().findElement(By.xpath("//li[contains(text(),'Authentication failed.')]")).getText();
  }
}
