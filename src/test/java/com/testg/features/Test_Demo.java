package com.testg.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Demo {

	@BeforeSuite
	private void set_Property() {

		System.out.println("Set property");

	}

	@BeforeTest
	private void browser_Launch() {

		System.out.println("Browser launch");

	}

	@BeforeClass
	private void url() {

		System.out.println("url");

	}

	@Test
	private void laptop() {
		System.out.println("laptop");
	}

	@BeforeMethod
	public void login() {

		System.out.println("login");

	}

	@AfterMethod
	private void logout() {

		System.out.println("logout");

	}

	@Test
	public void mobile() {

		System.out.println("mobile");

	}

	@Test
	private void headphones() {

		System.out.println("headphones");

	}

	@AfterClass
	private void verify_Home_Page() {

		System.out.println("verify home page");

	}

	@AfterTest
	private void close() {

		System.out.println("close");

	}

	@AfterSuite
	private void deleteAll_Cookies() {

		System.out.println("Delete All Cookies");

	}

}
