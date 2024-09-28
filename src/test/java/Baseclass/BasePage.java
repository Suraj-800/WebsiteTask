package Baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	
	public  WebDriver driver;
     String browser = "chrome";
    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }

    // Method to initialize the WebDriver based on the browser type
    public WebDriver initializeBrowser(String browser) {
        this.browser = browser.toLowerCase();
        switch (this.browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("about:blank");
                options.addArguments("--disable-extensions");
                // Optional: use a fresh profile
                options.addArguments("--user-data-dir=/path/to/fresh/profile");
                driver = new ChromeDriver(options);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                throw new IllegalArgumentException("Unsupported browser: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Implicit wait
		return driver;
    }

    // Method to navigate to a URL
    public void navigateToUrl(String url) {
        driver.get(url);
    }

    // Method to close the browser
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Getter for driver (if needed in subclasses)
    public WebDriver getDriver() {
        return driver;
    }
}

	
     
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    

