package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signUp {

	WebDriver driver;
	
	By inputUsername = By.xpath("//input[@data-qa=\"signup-name\"]");
	By inputEmail = By.xpath("//input[@data-qa=\"signup-email\"]");
	By btnSubmit = By.xpath("//button[@data-qa=\"signup-button\"]");
	By inputPassword = By.xpath("//input[@data-qa=\"password\"]");
	By firstName = By.xpath("//input[@data-qa=\"first_name\"]");
	By lastName = By.xpath("//input[@data-qa=\"last_name\"]");
	By company = By.xpath("//input[@data-qa=\"company\"]");
	By adress1 = By.xpath("//input[@data-qa=\"address\"]");
	By adress2 = By.xpath("//input[@data-qa=\"address2\"]");
	By state = By.xpath("//input[@data-qa=\"state\"]");
	By city = By.xpath("//input[@data-qa=\"city\"]");
	By zipCode = By.xpath("//input[@data-qa=\"zipcode\"]");
	By mobileNumber = By.xpath("//input[@data-qa=\"mobile_number\"]");
	By createAccountBtn = By.xpath("//p[@class=\"required form-group\"]/following-sibling::button");
	By successTitle = By.xpath("//h2[@class=\"title text-center\"]");
	By inputSubscribe = By.id("susbscribe_email");
	
	public signUp(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void SignUpData(String username, String email, String password) 
	{
		driver.findElement(inputUsername).sendKeys(username);
		driver.findElement(inputEmail).sendKeys(email);
		driver.findElement(btnSubmit).click();
		driver.findElement(inputPassword).sendKeys(password);
	}
	
	public void addressInformation(String firstName_, String lastName_, String company_, String adress1_, String adress2_, String state_, String city_, String zipCode_, String mobileNumber_) 
	{
		driver.findElement(firstName).sendKeys(firstName_);
		driver.findElement(lastName).sendKeys(lastName_);
		driver.findElement(company).sendKeys(company_);
		driver.findElement(adress1).sendKeys(adress1_);
		driver.findElement(adress2).sendKeys(adress2_);
		driver.findElement(state).sendKeys(state_);
		driver.findElement(city).sendKeys(city_);
		driver.findElement(zipCode).sendKeys(zipCode_);
		driver.findElement(inputSubscribe).sendKeys("dummy");
		driver.findElement(mobileNumber).sendKeys(mobileNumber_);
		driver.findElement(createAccountBtn).click();
		
	}
	
	
}
