package com.mobileautomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class MakemyTrip_Search {
	public DesiredCapabilities dc;
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "Nokia x");
	  dc.setCapability("platformVersion", "4.0");
	  dc.setCapability("platformName", "android");
	  dc.setCapability("appPackage", "com.makemytrip");
	  dc.setCapability("appActivity", "com.mmt.travel.app.home.ui.SplashActivity");
	  driver =new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	  //update
	  
	  
  }

  @AfterTest
  public void afterTest() throws Exception {
	  Thread.sleep(8000);
  }

}
