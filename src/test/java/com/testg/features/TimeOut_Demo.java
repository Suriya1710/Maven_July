package com.testg.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.utilityfiles.Utility_Files;

public class TimeOut_Demo extends Utility_Files{
	
	public static WebDriver driver;
	
	@Test(timeOut = 35000)
	private void timeout_Demo() {

		driver = get_Browser("chrome");
		
		get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.id("em")).sendKeys("abc");
		
		driver.findElement(By.id("pa")).sendKeys("a");
		
		
	}
	
	
	
	

}
