package day12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multiplewindows1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
	}
	
	@Test
	public void multipleWindowTest()
	{
		driver.findElement(By.linkText("Help")).click();
		switchWindow("//*[@id='ohid_footer']/div/span[7]/a");
		switchWindow("html/body/div[4]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/p[7]/a");
		
	}
	
	public void switchWindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath(x)).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
		
	}

}
