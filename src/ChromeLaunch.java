import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLaunch {

	static ChromeDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://bing.com");
		driver.findElement(By.linkText("Help")).click();
		switchWindow("//*[@id='ohid_footer']/div/span[7]/a");
		switchWindow("html/body/div[4]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/p[7]/a");
		
	}
	
	public static void switchWindow(String x)
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


