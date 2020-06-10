package com.hrms.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.Base;


public class AddEmployee {

	@FindBy(xpath="//*[@id='chkLogin']")
	public WebElement checklogin;
	
	@FindBy(xpath="//*[@id='firstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//*[@id='lastName']")
	public WebElement lastName;
	
	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	@FindBy(xpath="//*[@id='user_name']")
	public WebElement userName;
	
	@FindBy(xpath="//*[@id='user_password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='re_password']")
	public WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id='btnSave']")
	public WebElement save;
	
	
	
	public AddEmployee(){
		PageFactory.initElements(Base.driver, this);
	}
}
