package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicXpaths {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
	}
	
	@Test
	public void xpathTest()
	{
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_1438')]/div/ol/li[6]/a")).click();
	}
	

}
