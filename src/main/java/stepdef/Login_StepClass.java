package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepClass {
	
	@Given("User is at  login Page")
	public void user_is_at_login_page()
	{
	    System.out.println("User is at login Page");
	    
	}

	@When("Use enter the username")
	public void use_enter_the_username() 
	{
		System.out.println("Enter Username");
		
	}

	@When("User enter the password")
	public void user_enter_the_password()
	{
		System.out.println("password entered");
	}

	@When("User click on login button")
	public void user_click_on_login_button() 
	{
		System.out.println("Button clicked");
		
	}

	@Then("User should be successfully log in to application")
	public void user_should_be_successfully_log_in_to_application()
	{
		System.out.println("Successfully logged in");
		System.out.println("Mission Completed");
	}

}
