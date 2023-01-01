package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/Register.html"}, //reporting purpose
		monochrome=false,  //console output color
		tags = "@feature001", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= "Stepdefinition") //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
}
