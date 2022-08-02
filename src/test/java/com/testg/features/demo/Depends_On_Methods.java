package com.testg.features.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Depends_On_Methods {

	@Test(dependsOnMethods = "zebronics",alwaysRun = true)
	private void offer() {
		System.out.println("offer");
	}

	@Test
	public void zebronics() throws Exception {

		System.out.println("zebronics");

		throw new Exception();
		
	}

	@Test(priority = -2,description = "first method")
	private void headphones() {

		System.out.println("headphones");

	}

}
