package com.mobileautomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class Spicejet_Lunch {
	public DesiredCapabilities dc;
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc = new DesiredCapabilities();
	  dc.setCapability("deviceName", "Redmi");
	  dc.setCapability("platformVersion", "4.0");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  
	  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
  //update
  }

  @AfterTest
  public void afterTest() {
  }

}
