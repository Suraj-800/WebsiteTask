package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BasePage;

public class welcomePage extends BasePage{
	
	
	WebDriver driver;
	
	
	public welcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[normalize-space()='Sign up']")
	WebElement SignupButton;
	
	
	
	
	public void ClickSingupButton()
	{
		SignupButton.click();
	}
	
	
	
	
	
	
	
	

}
