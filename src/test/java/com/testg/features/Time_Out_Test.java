package com.testg.features;

import org.testng.annotations.Test;

public class Time_Out_Test {

	@Test(timeOut = 6000)
	private void demo() throws InterruptedException {

		Thread.sleep(2000);

		System.out.println("browser launch");
		
		Thread.sleep(2000);
		
		System.out.println("url");

		Thread.sleep(3000);
		
		System.out.println("credentials entered");
	}

}
