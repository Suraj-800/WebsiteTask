package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baseclass.BasePage;

public class EmailAuthrization extends BasePage {

	public EmailAuthrization(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@aria-label='Please enter OTP character 1']")
	WebElement codeInput;
	
	@FindBy(xpath="//button[contains(text(), 'Continue')])")
	WebElement continueButton;		

	 // Method to enter the demo authorization code
    public void enterDemoAuthorizationCode() {
        String demoAuthCode = "123456"; // Your demo authorization code
        codeInput.clear();  // Clear the input field
        codeInput.sendKeys(demoAuthCode);  // Enter the demo authorization code
    }

    // Method to click the Continue button
    public void clickContinue() {
        continueButton.click();  // Click on the Continue button
    }

    // Method to complete the authorization process with the demo code
    public void completeAuthorization() {
        enterDemoAuthorizationCode();  // Enter the demo code
        clickContinue();  // Click the continue button
    }
}


