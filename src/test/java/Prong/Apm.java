package Prong;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Apm {
	String fb="https://www.facebook.com/";
	RemoteWebDriver driver;
  @Test
  public void f() throws InterruptedException {
	   //	driver.get(fb);
		//driver.findElement(By.name("email")).sendKeys("gaurav");
		 // driver.findElement(By.name("pass")).sendKeys("xyz123");
	  
			
	  
	  			WebElement loginID=driver.findElement(By.id("com.demo.amanora:id/loginGold"));
	  			loginID.click();
	  			Thread.sleep(4000);
	  			WebElement subelement=driver.findElement(By.id("com.demo.amanora:id/storesLayout"));
	  			subelement.click();
	  	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  File app=new File("Resource/TheMallApp.apk");
	  DesiredCapabilities cap= DesiredCapabilities.android();
	 //cap.setCapability("browserName","chrome"); 
	 cap.setCapability("deviceName", "Redmi");
	 cap.setCapability("platformVersion", "6.0.1");
	  
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("app",app.getAbsolutePath());
	  
	 driver=new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
