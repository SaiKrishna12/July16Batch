import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class StoringLinksandImages {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://mirror.co.uk");
	}
	@Test
	public void linksandImages()
	{
		List<WebElement> allElements=driver.findElements(By.tagName("a"));
		System.out.println(allElements.size());
		allElements.addAll(driver.findElements(By.tagName("img")));
		System.out.println(allElements.size());
	}

}
