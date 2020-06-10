package com.hrms.testbase;

import org.openqa.selenium.WebDriver;




import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utils.ConfigReader;
import com.hrms.utils.Paths;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {

	public static WebDriver driver;
	public static WebDriver setbrowser() {
		ConfigReader.confread(Paths.filePath);	
		
		switch(ConfigReader.getProp("browser")) {
		case("chrome"):
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
		case("firefox"):
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		default:
		throw new RuntimeException("invalid browser");
		}
		PageInitializer.pageinit();
		driver.get(ConfigReader.getProp("url"));
		return driver;
	}
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
}
