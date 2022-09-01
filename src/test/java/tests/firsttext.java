package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.intialize;
import pageobject.itpeople;

public class firsttext extends intialize {

	public WebDriver driver;
   @Test
	public void fistpage() throws IOException

	{
      
	   
	   System.out.println("nagarajan is high paid");
		driver = intializedriver();

		driver.get(prop.getProperty("url"));

		itpeople first = new itpeople(driver);
		
		
		first.dashboard.click();
		
		driver.quit();

	}

}
