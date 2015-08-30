package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CaptchaAutomation {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
	}
	
	@Test
	public void captchaTest() throws InterruptedException
	{
		for(int l=1;l<=9;l++)
		{
			driver.findElement(By.id("edit-submitted-name")).sendKeys("tester");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("tester@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid change the captcha");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String[] a=x.split(" ");
			int i=Integer.parseInt(a[0]);
			int j=Integer.parseInt(a[2]);
			int k=i+j;
			String str=Integer.toString(k);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/div[5]/input")).click();
			driver.navigate().refresh();
		}
		
		
		
	}

}
