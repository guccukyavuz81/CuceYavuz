package com.hrms.steps;


import org.junit.Assert;

import com.hrms.testbase.Base;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginTest extends CommonMethods{
	

	@Given("ValidLogin")
	public void validlogin() {
		sendText(loginpage.username, ConfigReader.getProp("username"));
		sendText(loginpage.password, ConfigReader.getProp("password"));
		click(loginpage.btnLogin);   
		String expectedUser = "Welcome Admin";
		String actualUser = dash.welcome.getText();
		Assert.assertEquals("Admin is NOT Logged in",expectedUser,actualUser  );
		//Assert.assertTrue(actualUser.contains(ConfigReader.getProp("username")));
		Base.tearDown();	

	}

	@Then("invalidPasswordLogin")
	public void invalidpasswordlogin() {
		Base.setbrowser();	

		sendText(loginpage.username, ConfigReader.getProp("username"));
		//loginpage.username.sendKeys("Admin");
		sendText(loginpage.password, "uiuguig");
		click(loginpage.btnLogin);
		String expected = "Invalid credentials";
		Assert.assertEquals("Error message text is not matched",expected,loginpage.errormsg.getText() );
		Base.tearDown();	

    
	}

	@Then("emptyUsernameLogin")
	public void emptyusernamelogin() {
		  

		Base.setbrowser();	

		sendText(loginpage.password, ConfigReader.getProp("password"));
		click(loginpage.btnLogin);

		String expected = "Username cannot be empty";

		Assert.assertEquals("Error message text is not matched",expected,loginpage.errormsg.getText() ); 
		

	}


}
