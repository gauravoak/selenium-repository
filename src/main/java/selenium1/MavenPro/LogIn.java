package selenium1.MavenPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	WebDriver driver;
	By moileLocator=By.id("login-mobile");
	By loinpasslocator=By.id("login-password");
	By loginLocator=By.xpath("//button [@type='submit'][@id='sub_btn']");
	
	String number="9009999544";
	
	public LogIn( WebDriver driver3)
	{
		driver=driver3;
	}
	
	private void loginMobfunction()
	{
		WebElement loginMob=driver.findElement(moileLocator);
		loginMob.sendKeys(number);
	}
	
	private void loginPassfunction()
	{
		WebElement loginPass=driver.findElement(loinpasslocator);
		  loginPass.sendKeys("nikita21");
	}
	
	private void logInButnfunction()
	{
		WebElement logIn=driver.findElement(loginLocator);
		  logIn.click();
	}
	
	public void logfun()
	{
	
		loginMobfunction();
		
		loginPassfunction();
	  
		logInButnfunction();

	}
}
