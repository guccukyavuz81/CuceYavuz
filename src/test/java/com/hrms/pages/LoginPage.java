package com.hrms.pages;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.Base;




public class LoginPage {

	@FindBy (id = "txtUsername")
	public WebElement username;
	
	@FindBy (id = "txtPassword")
	public WebElement password;
	
	@FindBy (id = "btnLogin")
	public WebElement btnLogin;
	
	@FindBy(xpath="//*[@id='spanMessage']")
	public WebElement errormsg;
	
	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;
	
	public LoginPage(){
		PageFactory.initElements(Base.driver, this);
	}
	
}
