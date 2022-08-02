package com.testg.features;

import org.testng.annotations.Test;

public class Amazon {

	@Test
	private void zebronics() {

		System.out.println("zebronics");

	}

	@Test(dependsOnMethods = "zebronics")
	private void offer() {
		System.out.println("offer");
	}
	
	@Test(dependsOnMethods = "offer")
	private void offer_Watch() {
		System.out.println("offer watch");
	
	}

	@Test
	private void lenovo() {
		System.out.println("lenovo");
	}

}
