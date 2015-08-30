package day27.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeMercuryTours {
	public Menu menu;
	public WelcomeMercuryTours(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}
	
	@CacheLookup
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement login;
	public void findAFlight(String userName,String password)
	{
		this.userName.sendKeys(userName);
		this.password.sendKeys(password);
		login.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement destinations;
	public void destinations()
	{
		destinations.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement vacations;
	public void vacations()
	{
		vacations.click();
	}
	
	@FindBy(linkText="Register here")
	WebElement register;
	public void register()
	{
		register.click();
	}
 }

