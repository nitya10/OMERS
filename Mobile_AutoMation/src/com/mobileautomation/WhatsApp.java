package com.mobileautomation;

//import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WhatsApp {
	public DesiredCapabilities dc;
	public WebDriver d;
  @Test
  public void f() throws Exception{
	  dc = new DesiredCapabilities();
	  dc.setCapability("deviceName", "Redmi");
	  dc.setCapability("platformVersion", "4.0");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.whatsapp");
	  dc.setCapability("appActivity", "com.whatsapp.Main");
	  
	  d = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
  }
}