package com.org.phone;

public class Shop {

	public static void main(String[] args) {

		Phone phone = new PhoneBuilder().setOs("Android").setRam(3).getPhone();
		System.out.println(phone);
	}
}
