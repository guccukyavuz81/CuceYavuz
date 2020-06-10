package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleLogin extends CommonMethods{

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		loginpage.username.sendKeys(username);	
		loginpage.password.sendKeys(password);
		 
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginpage.btnLogin.click();  
		Thread.sleep(3000);
	}

	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String FirstName) {
		   String expected = "Welcome "+FirstName;
		   String actual = dash.welcome.getText();
		   Assert.assertEquals("Test Case is Failed", expected, actual);
	}

	
}
