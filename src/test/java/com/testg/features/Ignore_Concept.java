package com.testg.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	private void spotify() {
		System.out.println("Spotify");
	}

	
	@Test
	private void wynk() {
		System.out.println("Wynk");
	}

	
	@Test
	private void reddit() {
		System.out.println("reddit");
	}

	
	@Ignore
	@Test
	private void facebook() {
		System.out.println("facebook");
	}

	@Test(enabled = false)
	private void suriya_Notes() {
		System.out.println("Suriya Notes");
	}

}
