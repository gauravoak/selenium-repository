package Prong;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import selenium1.MavenPro.LogIn;
import selenium1.MavenPro.Product;
import selenium1.MavenPro.SignUP;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 
	  SignUP ref= new SignUP(driver);
	  ref.signin();

	  LogIn ref1=new LogIn(driver);
	  ref1.logfun();
	  
	  Product ref2=new Product(driver);
	  ref2.productInfo();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev.tracko.co.in/index.html");
		 

	  
  }

  @AfterTest
  public void afterTest() {
  }

}
