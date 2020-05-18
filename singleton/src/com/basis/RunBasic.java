package com.basis;

public class RunBasic {

	public static void main(String[] args) {

		SingletonBasic singletonBasic = SingletonBasic.getInstance();

		System.out.println("First Object Referance : " + singletonBasic);

		SingletonBasic singletonBasic1 = SingletonBasic.getInstance();

		System.out.println("Second Object Referance : " + singletonBasic1);
	}

}
