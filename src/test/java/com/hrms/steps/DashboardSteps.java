package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;


import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboardSteps extends CommonMethods{

	@Then ("admin sees admin dashboard items displayed")
	public void admin_sees_admin_dashboard_items_displayed(DataTable datatable) {
	List<String> expectedMenu=	datatable.asList();
	List<String> actualMenu=new ArrayList<String>();
	
	for(WebElement el:dash.dashboardElements) {
		actualMenu.add(el.getText());
	}
	System.out.println(expectedMenu);
	System.out.println(actualMenu);

	Assert.assertTrue(actualMenu.equals(expectedMenu));
	}
}
