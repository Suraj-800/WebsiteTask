package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baseclass.BasePage;

public class ProfileInfo extends BasePage {

	public ProfileInfo(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath=("//input[@placeholder='Enter First Name']"))
	WebElement fristName;
	
	@FindBy(xpath=("//input[@placeholder='Enter Last Name']"))
	WebElement lastname;
	
	@FindBy(xpath=("//input[@placeholder='Enter PIN code']"))
	WebElement Enterpincode;
	
	@FindBy(xpath=("//button[@type='submit']"))
	WebElement continueButton;

	
	
	
	public void Enterfristname(String FristName) {
		fristName.clear();
		fristName.sendKeys(FristName);
	}
	
	public void Enterlastname(String LastName) {
		lastname.clear();
		lastname.sendKeys(LastName);
	}
	
	public void Enterpicode(String Pincode) {
		lastname.clear();
		lastname.sendKeys(Pincode);
	}
	
	public void clickonbutton() {
		continueButton.click();
	}
	
}
