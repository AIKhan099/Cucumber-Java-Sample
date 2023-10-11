package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        // Initialize WebDriver before each scenario
        webDriverInstance.getDriver();
    }

    @After
    public void tearDown() {
        // Quit WebDriver after each scenario
    	webDriverInstance.quitDriver();
    }
}
