package com.hrms.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.Base;


public class HRMSAddEmployee {

	@FindBy(xpath="//*[@id='personal_cmbNation']")
	public WebElement nationalityDD;
	
	@FindBy(xpath="//input[@name='personal[optGender]']")
	public WebElement genderRadio;
	
	HRMSAddEmployee(){
		PageFactory.initElements(Base.driver, this);
	}
	
}
