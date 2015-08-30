package day17;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementPresence {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void elementTest()
	{
		String str=driver.getPageSource();
		String[] a=str.split("Rajinikanth");
		System.out.println(a.length);
		
	}

}
