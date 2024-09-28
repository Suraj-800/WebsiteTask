package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baseclass.BasePage;

public class onBoardingPage extends BasePage {
	WebDriverWait wait;
    // Constructor
    public onBoardingPage(WebDriver driver) {
       super(driver);
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
	
	@FindBy(xpath=("//p[normalize-space()='Social Media']"))
	WebElement socialMediaOption;
	
	@FindBy(xpath="//p[normalize-space()='Student']")
	WebElement roleoption;
	
	@FindBy(xpath="//p[normalize-space()='Job Opportunities']")
    WebElement   goaloption;
	
	@FindBy(xpath="//button[text()='Continue']")
	WebElement Continuebutton;
	
	public void selectHearoption()
	{
		socialMediaOption.click();
        wait.until(ExpectedConditions.visibilityOf(socialMediaOption)); // Waiting for visibility
        Continuebutton.click();

	}
	
	public void selectRoleoption() {
		roleoption.click();
		Continuebutton.click();


	}
	
	public void selectgoaloption() {
		goaloption.click();
		Continuebutton.click();

	}
	
	
	
	

}
