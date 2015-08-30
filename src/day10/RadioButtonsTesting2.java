package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonsTesting2 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://echoecho.com/htmlforms10.htm");
	}
	
	@Test
	public void radioButtonsTest() throws InterruptedException
	{
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		for(int k=1;k<=2;k++)
		{
			List<WebElement> radio=block.findElements(By.name("group"+k));
			for(int i=0;i<radio.size();i++)
			{
				radio.get(i).click();
				for(int j=0;j<radio.size();j++)
				{
					System.out.println(radio.get(j).getAttribute
							("value")+"--"+radio.get(j).getAttribute("checked"));
				}
				Thread.sleep(2000);
				System.out.println("#######################");
			}
		}
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	


}
