package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionRun {

	public static void main(String[] args) {
		ReflectionSingleton singleton = ReflectionSingleton.getInstance();
		ReflectionSingleton singleton2 = null;

		try {
			Constructor<ReflectionSingleton> constructor = ReflectionSingleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			singleton2 = (ReflectionSingleton) constructor.newInstance();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println("1st Object Reference : " + singleton);
		System.out.println("2nd Object Reference : " + singleton2);
	}

}
