package com.testg.features;

import org.testng.annotations.Test;

public class Description_Demo {

	@Test(description = "chrome browser")
	private void browser_Launch() {

		System.out.println("Browser launch");

	}

}
