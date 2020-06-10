package com.hrms.pages;



import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.Base;




public class DashBoardPageElements {

	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']")
	public WebElement pim;
	
	@FindBy(xpath="//*[@id='btnAdd']")
	public WebElement addEmployee;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	@FindBy(xpath="//div[@class='menu']/ul/li")
	public List<WebElement> dashboardElements;

	
	public DashBoardPageElements() {
		PageFactory.initElements(Base.driver, this);
	}
}