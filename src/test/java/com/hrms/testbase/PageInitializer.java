package com.hrms.testbase;

import com.hrms.pages.AddEmployee;

import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.LoginPage;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ViewEmloyeePage;

public class PageInitializer extends Base{

	public static DashBoardPageElements dash;
	public static LoginPage loginpage;
	public static AddEmployee addemployee;
	public static PersonalDetailsPageElements personalDetails;
	public static ViewEmloyeePage viewEmployee;
	
	public static void pageinit() {
		dash=new DashBoardPageElements();
		 loginpage=new LoginPage();	
		 addemployee=new AddEmployee();
		 personalDetails=new PersonalDetailsPageElements();
		 viewEmployee=new ViewEmloyeePage();
	}
	 
	

	
}
