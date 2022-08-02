package com.testg.features;

import org.testng.annotations.Test;

public class Group_Demo {

	@Test(groups = "Music")
	private void spotify() {

		System.out.println("Spotify");

	}

	@Test(groups = "Music")
	private void wynk() {
		System.out.println("Wynk");

	}

	@Test(groups = "social media")
	private void reddit() {

		System.out.println("Reddit");

	}

	@Test(groups = "social media")
	private void facebook() {

		System.out.println("facebook");

	}

	@Test(groups = "news")
	private void cricbuzz() {

		System.out.println("Cricbuzz");

	}

}
