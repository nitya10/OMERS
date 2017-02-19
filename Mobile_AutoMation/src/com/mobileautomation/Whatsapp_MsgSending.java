package com.mobileautomation;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class Whatsapp_MsgSending {
	public DesiredCapabilities dc;
	public AndroidDriver<WebElement>driver;
  @Test
  public void f() throws Exception {
	  driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElementByAndroidUIAutomator("UiSelector().class(\"android.widget.TextView\").instance(3)").click();
  }
  @BeforeTest
  public void beforeTest() {
	  dc=new DesiredCapabilities();
	  dc.setCapability("deviceName", "Aqua Speed");
	  dc.setCapability("platformVersion", "5.0");
	  dc.setCapability("platformName", "Android");	  
	  dc.setCapability("appPackage", "com.sec.android.app.launcher");
	  dc.setCapability("appActivity", "com.android.launcher2.Launcher");
  }

  @AfterTest
  public void afterTest() {
  }

}
