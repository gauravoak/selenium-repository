package selenium1.MavenPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product {
	WebDriver driver;
	
	public Product(WebDriver driver4)
	{
		driver=driver4;
	}
	public void productInfo()
	{
		 driver.findElement(By.xpath("//a [text()='Products']")).click();
		 //driver.findElement(By.id("name")).sendKeys("gaurav");
		 driver.findElement(By.xpath("//a [text()='Details']")).click();
		 driver.findElement(By.xpath("//a [text()='Order Now ']")).click();
	}

}
