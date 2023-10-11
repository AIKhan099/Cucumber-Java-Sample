package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login{
	
	WebDriver driver;
	
	By inputEmail = By.xpath("//input[@data-qa=\"login-email\"]");
	By inputPassword = By.xpath("//input[@data-qa=\"login-password\"]");
	By submit = By.xpath("//button[@data-qa=\"login-button\"]");
	By accDelBtn = By.xpath("(//ul[@class=\"nav navbar-nav\"]/li)[5]/a");
	By logoutBtn = By.xpath("(//ul[@class=\"nav navbar-nav\"]/li)[4]/a");
	
	public login(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void loginData( String email, String password) 
	{
		driver.findElement(inputEmail).sendKeys(email);
		driver.findElement(inputPassword).sendKeys(password);
		driver.findElement(submit).click();
		
	}

}
