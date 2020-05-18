package com.org;

import com.org.factory.OperatingSystemFactory;
import com.org.phone.OS;

public class FactoryMain {

	public static void main(String[] args) {
		
		OperatingSystemFactory osf = new OperatingSystemFactory();
		OS os = osf.getInstance("Android");
		os.spec();
	}

}
