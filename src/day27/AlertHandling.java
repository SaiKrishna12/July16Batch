package day27;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	
	@Test
	public void alertTest() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Friends');");
		Thread.sleep(5000);
		handleAlert();
		
	}
	
	public void handleAlert()
	{
		Alert alert = null;
		try
		{
			alert=driver.switchTo().alert();
			alert.accept();
		}
		catch(Exception e)
		{
			try
			{
				alert.dismiss();
				
			}
			catch(Exception e1)
			{
				
			}
			
		}
	}

}
