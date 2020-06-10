package com.hrms.steps;

import org.openqa.selenium.By;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods{


	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
	    loginpage.username.sendKeys(ConfigReader.getProp("username"));
	    sendText(loginpage.password, ConfigReader.getProp("password"));
	    click(loginpage.btnLogin);
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
	    click(dash.pim);
	    click(dash.empListPage);
	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
	   //driver.findElement(By.xpath("//*[@id='empsearch_id']")).sendKeys("10093");   or below with POM 
		viewEmployee.EmpID.sendKeys("10093");
	}
	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
	    //driver.findElement(By.xpath("//*[@id='searchBtn']")).click();          or below with POM
		viewEmployee.searchBtn.click();
		Thread.sleep(5000);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	System.out.println("bu kardesimizin id si aha bu"+driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr/td[2]/a")).getText());
	
	
	}
}
