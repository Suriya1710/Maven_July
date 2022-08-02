package com.pojo;

public class Pojo_B {

	public static void main(String[] args) {

		Pojo_A p = new Pojo_A();

		int value = p.getA(); // ---> 10

		// p.setA(17);

		int new_Value = p.getA();

		System.out.println(value); // --> 10

		System.out.println(new_Value); //---> 17

	}

}
