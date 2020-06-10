package com.hrms.utils;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.PageInitializer;

public class CommonMethods extends PageInitializer{

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * 
	 * @param radioOrCheckbox
	 * @param value
	 */
	
	public static void clickRadioCheckBox(List<WebElement> radioOrCheckbox, String value) {
		String actualValue;
		for(WebElement el:radioOrCheckbox) {
			actualValue=el.getAttribute("value").trim();
			if(el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}
	
	public static void selectDD(WebElement element, String textToSelect) {
		
		try {
			Select select=new Select(element);
			List<WebElement> options=select.getOptions();
		//	select.selectByVisibleText(textToSelect);   //bu zaten yapiyor loop a ve list e hic gerek yok :-))
			for(WebElement el:options) {
				if(el.getText().equals(textToSelect)) {
					el.click();
					break;
				}
			}
		}catch(UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	
	public static void acceptAlert() {
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
    public static void dismissAlert() {
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
	
       public static void sendAlertText(String text) {
		
		try {
			Alert alert=driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		}catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
       
       public static void switchToFrame(String nameOrId) {
    	   
    	   try {
    		  driver.switchTo().frame(nameOrId);
    	   }catch(NoSuchFrameException e) {
    		e.printStackTrace();   
    	   }
       }
	
       public static void switchToFrame(WebElement element) {
    	   
    	   try {
    		  driver.switchTo().frame(element);
    	   }catch(NoSuchFrameException e) {
    		e.printStackTrace();   
    	   }
       }
       
       public static void switchToFrame(int index) {
    	   
    	   try {
    		  driver.switchTo().frame(index);
    	   }catch(NoSuchFrameException e) {
    		e.printStackTrace();   
    	   }
       }
       
       
   	public static WebDriverWait getWaitObject() {
   		WebDriverWait wait=new WebDriverWait(driver, Paths.EXPLICIT_WAIT_TIME);
   		return wait;
   	}
   	
   	public static void waitForClickability(WebElement element) {
   		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
   	}
   	
   	public static void click(WebElement element) {
   		waitForClickability(element);
   		element.click();
   	}
   	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click();", element);
	}

   	
   	public static String takeScreenshot(String filename) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = Paths.SCREENSHOT_FILEPATH + filename + getTimeStemp() + ".png";

		try {
			FileUtils.copyFile(file, new File(destinationFile));
		} catch (Exception ex) {
			System.out.println("Cannot take screenshot!");
		}

		return destinationFile;
	}

	public static String getTimeStemp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		return sdf.format(date.getTime());
	}

	public static void wait(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

       
}
