package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baseclass.BasePage;

public class profilesetup extends BasePage {
	
	
	// Constructor
    public profilesetup(WebDriver driver) {
       super(driver);
    }
	
	
	@FindBy(xpath=("(//button)[2]"))
	WebElement ContinueEmailbutton;		
	
	@FindBy(xpath="//input[@placeholder='Enter email address']")
	WebElement emailid;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Cotinuebutton;
	
	
	public void selectwithEmail() {
		ContinueEmailbutton.click();
	}
	
	public void enteremailid(String email) {
		emailid.clear();
		emailid.sendKeys(email);
 
	}
	
	public void clickoncotinuebutton() {
		Cotinuebutton.click();
	}
	
	
}	


