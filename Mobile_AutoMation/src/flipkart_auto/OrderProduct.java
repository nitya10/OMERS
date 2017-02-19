package flipkart_auto;

import org.apache.commons.el.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import flipkart_Automation.Flipkart_Landingpage;
import flipkart_Automation.menTshirtPage;

public class OrderProduct {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Test
	public void orderproduct() throws Exception{
		System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Flipkart_Landingpage flipkartlandingpage=new Flipkart_Landingpage();
		flipkartlandingpage.clickMen(driver, wait);
		
		Thread.sleep(3000);
		
		flipkartlandingpage.clickTshirt(driver, wait);
		Thread.sleep(2000);
		
		menTshirtPage mentshirtpage=new menTshirtPage();
		mentshirtpage.clickVneck(driver, wait);
		
		
	}

}
