package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverInstance {
	
	    public static WebDriver driver;

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            // Initialize the WebDriver here (e.g., ChromeDriver, FirefoxDriver)
	            driver = new ChromeDriver();
	        }
	        return driver;
	    }

	    public static void quitDriver() {

	    	if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }

	
		}
	

