package TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclass.BasePage;
import PageObject.EmailAuthrization;
import PageObject.ProfileInfo;
import PageObject.SignupPage;
import PageObject.onBoardingPage;
import PageObject.profilesetup;
import PageObject.welcomePage;

public class TestClass {
	
	WebDriver driver;
    BasePage basePage;
    welcomePage wp;
    SignupPage sp;
    onBoardingPage op;
    profilesetup pf;
    
	    
		@BeforeMethod
	    public void setUp() {
	        basePage = new BasePage(driver);
	        driver = basePage.initializeBrowser("chrome");  // Initialize browser
	        basePage.navigateToUrl("https://sg-app.abouv.com/welcome");
	        
		}
	        @Test
	        public void testSignupProcess() throws InterruptedException {
	            // Step 1: Navigate to the Welcome page
	            driver.get("https://sg-app.abouv.com/welcome");
	            wp = new welcomePage(driver);
	            wp.ClickSingupButton(); // Assuming this method clicks the Get Started button
	            
	            // Step 2: Navigate to the Sign Up page
	            SignupPage sp = new SignupPage(driver);
	            sp.enterPhoneNumber("8989898089");// Replace with actual test phone number
	            //sp.clickSkipButton();
	            sp.clickSignUp(); // Click the Sign Up button
	            String otp= sp.getOTPFromBanner();//get otp from banner 
	            System.out.println("Extracted OTP: " + otp);// print otp
	            //Thread.sleep(5000);
	            sp.enterOtp(otp);
	            sp.clickoncotinuebutton();
	            Thread.sleep(5000);
	            // Step 3: Onboarding Hear Page
	            onBoardingPage op = new onBoardingPage(driver);
	            op.selectHearoption();// Select the hear option           
	            
	            op.selectRoleoption();// Select Role option
	            
	            op.selectgoaloption();// select goal option
	            
	            
	            
	            
	            // Step 6: Onboarding Profile Setup Page
	            profilesetup pf = new profilesetup(driver);
	            pf.selectwithEmail();
	            pf.enteremailid("suraj.mane3342@gmail.com");// Choose continue with email (implement this method in the POM)
	            pf.clickoncotinuebutton();
	            // Step 7: Email Authorization Page
	            EmailAuthrization emailAuthrization = new EmailAuthrization(driver);
	            emailAuthrization.completeAuthorization();// Assume this method handles entering a demo authorization code and clicks continue
	            
	            // Step 8: Profile Info Page
	            ProfileInfo profileinfo  = new ProfileInfo(driver);
	            profileinfo.Enterfristname("suraj");
	            profileinfo.Enterlastname("mane");
	            profileinfo.Enterpicode("411033");
	            profileinfo.clickonbutton();
	            
	            
	
	
	

}
}