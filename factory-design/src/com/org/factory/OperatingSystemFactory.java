package com.org.factory;

import com.org.phone.Android;
import com.org.phone.Ios;
import com.org.phone.OS;
import com.org.phone.Windows;

public class OperatingSystemFactory {

	public OS getInstance(String osType) {
		if ("Ios".equalsIgnoreCase(osType)) {
			return new Ios();
		} else if ("Android".equalsIgnoreCase(osType)) {
			return new Android();
		} else {
			return new Windows();
		}
	}

}
