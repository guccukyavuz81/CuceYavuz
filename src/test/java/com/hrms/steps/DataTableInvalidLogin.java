package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableInvalidLogin extends CommonMethods{

	@When("I enter invalid username and password and see error message")
	public void i_enter_invalid_username_and_password_and_see_error_message(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String,String>> lmap=dataTable.asMaps();
		
		for(Map<String,String> map:lmap) {
			loginpage.username.sendKeys(map.get("UserName"));
			loginpage.password.sendKeys(map.get("Password"));
			loginpage.btnLogin.click();
			System.out.println("did once");
			String expected=map.get("ErrorMessage");
			Assert.assertEquals(expected, loginpage.errormsg.getText());
			
		}
		
		
		
		
	}
	
	@When("I enter invalid {string} and {string}")
	public void i_enter_invalid_and(String username, String password) {
	 loginpage.username.sendKeys(username);  
	 loginpage.password.sendKeys(password);
	 loginpage.btnLogin.click();
	}

	@Then("I see error {string}")
	public void i_see_error(String errorMessage) {
	String expected=errorMessage;
	Assert.assertEquals(expected, loginpage.errormsg.getText());
	}
}
