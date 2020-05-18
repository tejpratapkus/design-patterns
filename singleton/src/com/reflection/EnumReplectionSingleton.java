package com.reflection;

public class EnumReplectionSingleton {

	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		
		System.out.println("1st Object Reference : " + singleton);
		System.out.println("2nd Object Reference : " + singleton2);
	}

}
