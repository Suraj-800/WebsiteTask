package PageObject;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException; // Import for TimeoutException

import Baseclass.BasePage;


public class SignupPage extends BasePage{
	
	WebDriver driver;
	public SignupPage(WebDriver driver) {
		super(driver);
	}

    
    @FindBy(xpath =("//input[@placeholder='Mobile Number']"))
    WebElement phoneNumberInput;
    
    @FindBy(xpath =("//button[@type='submit']")) // Change this XPath if necessary
    WebElement ContinueButton;
    
    @FindBy(xpath = "//button[contains(text(), 'Skip')]")
    WebElement skipButton;
    
    @FindBy(xpath = "//div[contains(text(), 'Verify OTP sent')]")
    WebElement otpBanner;

    @FindBy(xpath = "//input[@aria-label='Please enter OTP character 1']")
    private WebElement otpInput1;

    @FindBy(xpath = "//input[@aria-label='Please enter OTP character 2']")
    private WebElement otpInput2;

    @FindBy(xpath = "//input[@aria-label='Please enter OTP character 3']")
    private WebElement otpInput3;

    @FindBy(xpath = "//input[@aria-label='Please enter OTP character 4']")
    private WebElement otpInput4;
    
        
    
    
 // Method to enter phone number
    public void enterPhoneNumber(String phoneNumber) {
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys(phoneNumber);
    }

        // Method to click on the Sign Up button
          public void clickSignUp() {
        	  ContinueButton.click();
          }
        // Method to click on the Skip button
        public void clickSkipButton() {
            skipButton.click();
        }
            
          
     // Method to extract OTP from the banner
        public String getOTPFromBanner() {
            String bannerText = otpBanner.getText(); // Get the text from the OTP banner
            System.out.println(bannerText);
            String otp = bannerText.replaceAll("[^0-9]", ""); // Extract only the numeric part (OTP)
            return otp;
        }
        
        // Method to enter OTP
       /* public void enterOtp(String otp) {
            // Check if OTP length is 4
            if (otp.length() != 4) {
                throw new IllegalArgumentException("OTP must be 4 digits long");
            }

            // Loop through each character and enter it into the respective input field
            for (int i = 0; i < otp.length(); i++) {
                otpInputFields.get(i).sendKeys(String.valueOf(otp.charAt(i)));
            }*/

        public void enterOtp(String otp) {
        	// Clear previous OTP entries

            // Split the OTP string into individual characters
          
        	System.out.println(otp);
            // Enter each digit into the corresponding input field
            otpInput1.sendKeys(otp.charAt(12) + "");
            otpInput2.sendKeys(otp.charAt(13) + "");
            otpInput3.sendKeys(otp.charAt(14) + "");
            otpInput4.sendKeys(otp.charAt(15) + "");
        }
        	

        public void clickoncotinuebutton() {
        	ContinueButton.click();
        
        }
            
            
            
    
    }   
    
    
    

