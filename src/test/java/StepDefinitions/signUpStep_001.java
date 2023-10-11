package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import POM.signUp;
//import maintainDriver.webDriverInstance;

public class signUpStep_001 {
	WebDriver driver;
	public signUpStep_001() {
		this.driver = webDriverInstance.getDriver();
	}
	
//	@Before()
//	public void LauncingBrowser() 
//	{
//		driver = new ChromeDriver();	
//	}
//	
//	@After()
//	public void QuitingBrowser() 
//	{	
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    driver.quit();
//	}
	
	@Given("I am on the login page")
	//System.out.println("Hello there!");
	public void i_am_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("Hello there!");
	    //System.setProperty("webdriver.chrome.driver","C:/Users/Intel/eclipse-workspace/Cucumber-Java-Sample/src/test/resources/driver/chrome.exe");
		driver.get("https://www.automationexercise.com/login");
	   
	}

	//@When("I signup with jensmith, jen@gmail.co and {int}.")
	@When("I signup with {string}, {string} and {string}.")
	public void i_signup_with_jensmith_jen_gmail_co_and(String string1, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		System.out.println("Hello there!");
		signUp signup = new signUp(driver);
		signup.SignUpData(string1,string2,string3);
	}

	//@When("I enter address information Jen, smith, RFT,London,London,Eng,London,{int} and {int}.")
	@When("I enter address information {string}, {string}, {string},{string},{string},{string},{string},{string} and {string}.")
	public void i_enter_address_information_jen_smith_rft_london_london_eng_london_and(String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		//System.out.println("Hello there!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		signUp signup = new signUp(driver);
		signup.addressInformation( string1,  string2,  string3,  string4,  string5,  string6,  string7,  string8,  string9);
	}


}
