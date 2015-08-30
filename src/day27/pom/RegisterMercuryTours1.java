package day27.pom;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterMercuryTours1 {
	Menu menu=null;
	public RegisterMercuryTours1(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="address1")
	WebElement address1;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postalCode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	@FindBy(name="register")
	WebElement register;
	public void contactInformation(Row r)
	{
		firstName.sendKeys(r.getCell(0).getStringCellValue());
		lastName.sendKeys(r.getCell(1).getStringCellValue());
		phone.sendKeys(r.getCell(2).getStringCellValue());
		userName.sendKeys(r.getCell(3).getStringCellValue());
		address1.sendKeys(r.getCell(4).getStringCellValue());
		city.sendKeys(r.getCell(5).getStringCellValue());
		state.sendKeys(r.getCell(6).getStringCellValue());
		postalCode.sendKeys(r.getCell(7).getStringCellValue());
		country.sendKeys(r.getCell(8).getStringCellValue());
		email.sendKeys(r.getCell(9).getStringCellValue());
		password.sendKeys(r.getCell(10).getStringCellValue());
		confirmPassword.sendKeys(r.getCell(11).getStringCellValue());
		register.click();
	}

}
