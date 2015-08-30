package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalanderWebtable {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
	}
	
	@Test
	public void calanderTest() throws InterruptedException
	{
		driver.findElement(By.className("home-icon-booknow")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
		driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1']/option[@value='IXA']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@groupcontrolid='group_details1']/option[@value='BLR']")).click();
		driver.findElement(By.className("ui-datepicker-trigger")).click();
	
		String doj="12/11/2015";
		String[]a=doj.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=Integer.parseInt(a[1]);
		String month=months[x-1];
		String day=a[0];
		String year=a[2];
		
		String calyear=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
		while(!calyear.equals(year))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			calyear=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
		}
		
		String calmonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
		while(!calmonth.equals(month))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			calmonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
			
		}
		
		WebElement table=driver.findElement(By.id("ui-datepicker-div"));
		boolean flag=false;
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
				    cols.get(j).click();
				    flag=true;
				    break;
				}
			}
			if(flag==true)
			{
				break;
			}
		}
		
		
		
		
		
		
	
	
	
	}
	
	

}
