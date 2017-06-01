package selenium1.MavenPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUP 
{

	WebDriver driver;
	
	By nameLocator=By.id("name");
	By emailLocator=By.name("email");
	
	String mobilenumber="9009999544";
	String password1="nikita34";
	
	
	public SignUP(WebDriver driver2)
	{
		driver=driver2;
	}
	
	public void nameFunction()
	{
		WebElement name=driver.findElement(nameLocator);
		  name.sendKeys("gaurav");

	}
	public void emailfunction()
	{
		 WebElement email=driver.findElement(By.name("email"));
		  email.sendKeys("zzddddddttsw61@gmail.com");
	}
	public void signin() throws InterruptedException
	{	 //sign up free	
		 driver.findElement(By.xpath("//a [text()='Sign Up Free']")).click();
		 
		 nameFunction();
		 
		 emailfunction();
		 
		
		  WebElement mobile=driver.findElement(By.name("mobile"));
		  mobile.sendKeys(mobilenumber);
		  
		  WebElement signup=driver.findElement(By.xpath("//button [@type='button'][@id='sub_btn_signup']"));
		  signup.click();
		  
		  WebElement otp=driver.findElement(By.xpath("//input [@type='text'][@id='otp']"));
		  otp.sendKeys("123456");
		  
		  WebElement verifymobile=driver.findElement(By.xpath("//button [@class='btn btn-block btn-cta-primary'][@id='sub_btn_verify']"));
		  verifymobile.click();
		  
		  WebElement password =driver.findElement(By.id("password"));
		  password.sendKeys(password1);
		 
		  WebElement repassword =driver.findElement(By.id("repassword"));
		  repassword.sendKeys(password1);
		 
		  Thread.sleep(3000);
		  
		  //mobile number is successfully verified.please set your account password
		  WebElement ok=driver.findElement(By.xpath("//button [@class='confirm'][text()='OK']"));
		  ok.click();
		  
		  Thread.sleep(3000);
		  
		  //set password and procceed to login
		  WebElement setPass=driver.findElement(By.xpath("//button [@id='sub_btn_setpass'][@onclick='setPassword()']"));
		  setPass.click();
		
	}
}
