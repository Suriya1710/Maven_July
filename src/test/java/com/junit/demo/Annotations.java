package com.junit.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Annotations {

	@Before
	public void login() {
		System.out.println("login");
	}

	@After
	public void logout() {
		System.out.println("logout");
	}

	@Test
	private void lapop() {
		System.out.println("purchase laptop");
		System.out.println("add to cart");
	}

	@Test
	public void mobile() {
		System.out.println("purchase mobile");
		System.out.println("add to cart");
	}

}
