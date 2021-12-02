package pageObjectModelePractice;

import org.openqa.selenium.By;

public class HomePage {
	
	public void clickOnsignIn() {
		
BasesClasse.getWebDriver().findElement(By.xpath("//header[@id='header']/div[2]/div/div/nav/div/a")).click();

		
	}


}
