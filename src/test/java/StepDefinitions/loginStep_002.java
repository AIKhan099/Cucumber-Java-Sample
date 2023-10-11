package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.login;
//import maintainDriver.webDriverInstance;


public class loginStep_002 {

	WebDriver driver=null;
	public loginStep_002() {
		this.driver = webDriverInstance.getDriver();
	}
//	@Before
//	public void LauncingBrowser() {
//		driver = new ChromeDriver();
//		
//	}
//	
//	@After
//	public void QuitingBrowser() {
//		
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    driver.quit();
//	}
	@When("I login with {string} and {string}.")
	public void i_login_with_and(String string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   login log = new login(driver);
	   log.loginData(string1, string2);
	   //System.out.println("Hello there! 2 ");
	}

}
