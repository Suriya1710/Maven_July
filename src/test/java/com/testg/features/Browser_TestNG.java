package com.testg.features;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.Utility_Files;

public class Browser_TestNG extends Utility_Files {

	public static WebDriver driver; // ---> null

	@Test(invocationCount = 2,invocationTimeOut = 20000)
	private void browser_Launch() {

		driver = get_Browser("chrome");

		driver.get("https://www.facebook.com/");

	}
	
	
	
	

}
