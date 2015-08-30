package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActions {
	
	FirefoxDriver driver;
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://gmail.com");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("Email")).sendKeys("gandham.saikrishna");
	}
	public void clickNext()
	{
		driver.findElement(By.id("next")).click();
	}
	public void enterPassword()
	{
		driver.findElement(By.id("Passwd")).sendKeys("pass@123");
	}
	public void clickLogin()
	{
		driver.findElement(By.id("signIn")).click();
		
	}
}
