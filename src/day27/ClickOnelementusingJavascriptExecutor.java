package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClickOnelementusingJavascriptExecutor {
	@Test
	public void sampleTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yssofindia.org");
		WebElement element=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);

	}

}
