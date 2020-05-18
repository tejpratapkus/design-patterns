package com.reflection;

public class ReflectionSingleton {

	private static ReflectionSingleton singleton;

	private ReflectionSingleton() {

		if (singleton != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}

	}

	public static ReflectionSingleton getInstance() {
		if (singleton == null) {
			synchronized (ReflectionSingleton.class) {
				if (singleton == null) {
					singleton = new ReflectionSingleton();
				}
			}
		}
		return singleton;
	}

}
