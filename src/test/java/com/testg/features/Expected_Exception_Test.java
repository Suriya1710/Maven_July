package com.testg.features;

import org.testng.annotations.Test;

public class Expected_Exception_Test {
	
	@Test(expectedExceptions = NullPointerException.class)
	private void demo() {
		
		System.out.println(20/0);
		
	}
	
	
	
	

}
