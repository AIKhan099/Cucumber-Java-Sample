package StepDefinitions;
import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
//@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"}) 
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"}, 
plugin = {"pretty", "html:target/HtmlReports/Report.html"})
public class TestRunner {

}
 