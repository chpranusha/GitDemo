package Stepdefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//sd also called glue code
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pranusha_SD {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    WebDriver driver=new ChromeDriver();
	    driver.get("Https://www.google.com");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    
	}
	///comments for visibility

	@When("I complete action")
	public void i_complete_action() {
	    
	}

	@When("some other action")
	public void some_other_action() {
	    
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    
	}
}
