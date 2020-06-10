package com.hrms.utils;

public class Paths {

	 public static final String file=System.getProperty("user.dir");
	 public static final String filePath=file+"\\src\\test\\resources\\configs\\data.properties";
	 public static final String chropath=file+"\\src\\test\\resources\\drivers\\chromedriver.exe";
	 public static final String firepath=file+"\\src\\test\\resources\\Drivers\\geckodriver.exe";
	 public static final int IMPLICIT_WAIT_TIME=10;
	 public static final int EXPLICIT_WAIT_TIME=30;
	 
	 public static final String TESTDATA_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\addEmploye.xlsx";

	 public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"\\target\\html-report\\HRMS.html";

	 public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"\\screenshot\\";
	
}
