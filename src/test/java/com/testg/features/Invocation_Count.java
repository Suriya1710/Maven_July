package com.testg.features;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = -1)
	private void browser_Launch() {
		System.out.println("Browser launch");
	}

	@Test(priority = 1,invocationCount = 3,invocationTimeOut = 3000)
	private void refresh() {
		System.out.println("refresh");
	}

	@Test(priority = 2)
	private void login() {
		System.out.println("login");
	}

}
