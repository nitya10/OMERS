package flipkart_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class menTshirtPage {
	
	private static final String Vneck="//a[contains(text(),'V-Neck')]";
	
	public void clickVneck(WebDriver driver,WebDriverWait wait){
		driver.findElement(By.xpath(Vneck)).click();
	}

}
