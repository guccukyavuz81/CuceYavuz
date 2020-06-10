package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.Base;

public class ViewEmloyeePage {

	@FindBy (id="empsearch_employee_name_empName")
	public WebElement EmpName;
	
	@FindBy (id="empsearch_id")
	public WebElement EmpID;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	public ViewEmloyeePage() {
		PageFactory.initElements(Base.driver, this);
	}
}
