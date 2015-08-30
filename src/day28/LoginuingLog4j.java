package day28;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginuingLog4j {

	private static Logger log=Logger.getLogger(LoginuingLog4j.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser Launched");
		driver.get("http://yahoomail.com");
		log.info("Navigated to url");
		driver.findElement(By.id("login-username")).sendKeys("saikrishna");
		log.info("entered the username");
		driver.findElement(By.id("login-passwd")).sendKeys("pass@123");
		log.info("entered the password");
		driver.findElement(By.id("login-signin")).click();
		log.info("click on signin");

	}

}
