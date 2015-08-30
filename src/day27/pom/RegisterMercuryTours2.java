package day27.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterMercuryTours2 {
	Menu menu=null;
	public RegisterMercuryTours2(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
	WebElement acttext;
	public boolean validateRegistration(String exptext)
	{
		if(acttext.getText().contains(exptext))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	

}
