package com.hrms.steps;

import com.hrms.testbase.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void start() {
	Base.setbrowser();	
	}
	
	@After
	public void end() {
	Base.tearDown();	
	}
}
