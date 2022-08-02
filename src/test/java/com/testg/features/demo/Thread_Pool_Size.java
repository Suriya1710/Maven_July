package com.testg.features.demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.Utility_Files;

public class Thread_Pool_Size extends Utility_Files {

	public static WebDriver driver;

	@Test(invocationCount = 2,threadPoolSize = 3)
	private void browser() {

		driver = get_Browser("chrome");
		
		driver.get("https://www.facebook.com");

	}

}
