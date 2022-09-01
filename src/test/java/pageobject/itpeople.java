package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class itpeople {

	public WebDriver driver;

	
	public itpeople(WebDriver driver)

	{

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath ="//*[@id=\"main-nav\"]/li[1]")
	
	public WebElement dashboard;
	
	
	public WebElement dashboard()
	{
		
		return dashboard;
	}
	
	
}
