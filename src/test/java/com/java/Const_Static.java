package com.java;

public class Const_Static {

	public static String value; // --> null

	public Const_Static() {
		value = "Starc";
	}

	public static void xyz() {
		System.out.println(value);
	}

	public void abc() {
		System.out.println(value);
	}

	public static void main(String[] args) {
		Const_Static c = new Const_Static();
		c.abc();

	}

}
