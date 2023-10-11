package StepDefinitions;

import io.cucumber.java.en.When;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import POM.addingBlueProducts;

public class addingBlueProducts_004 {

	WebDriver driver;
	public addingBlueProducts_004() {
		this.driver = webDriverInstance.getDriver();
	}
	@When("I add all the blue products to cart.")
	public void i_add_all_the_blue_products_to_cart() throws IOException, ParseException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   addingBlueProducts add_ = new addingBlueProducts(driver);
	   add_.AddingBlueProducts();
	}

	@When("I check that all added products are blue.")
	public void i_check_that_all_added_products_are_blue() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 addingBlueProducts add_ = new addingBlueProducts(driver);
		 add_.checkingAllProductRBlue();
	}

	@When("I delete the account.")
	public void i_delete_the_account() {
	    // Write code here that turns the phrase above into concrete actions
		addingBlueProducts add_ = new addingBlueProducts(driver);
		add_.accountDeletion();
	}
}
