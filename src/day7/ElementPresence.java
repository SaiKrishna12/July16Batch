package day7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresence {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		String str=driver.getPageSource();
		if(str.contains("Rajnikanth"))
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}
		driver.close();

	}

}
