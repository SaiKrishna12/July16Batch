package day23;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Launch {
	FirefoxDriver  driver;
	@BeforeClass
	public void launchApp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}
	
	

}
