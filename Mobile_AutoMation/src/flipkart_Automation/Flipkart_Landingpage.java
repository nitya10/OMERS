package flipkart_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_Landingpage {
	private static final String men="//span[contains(text(),'Men')]";
	private static final String tshirt="//span[contains(text(),'T-Shirts')]";
	
	public void clickMen(WebDriver driver,WebDriverWait wait){
		driver.findElement(By.xpath(men)).click();
	}
	public void clickTshirt(WebDriver driver, WebDriverWait wait){
		driver.findElement(By.xpath(tshirt)).click();
	}

}
