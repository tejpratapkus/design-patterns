package com.basis;

public class SingletonBasic {

	private static SingletonBasic singletonBasic;

	private SingletonBasic() {
		if (SingletonBasic.singletonBasic != null) {
			throw new InstantiationError("Creating of this object is not allowed.");
		}

	}

	public static SingletonBasic getInstance() {
		if (singletonBasic == null) {
			synchronized (SingletonBasic.class) {
				if (singletonBasic == null) {
					singletonBasic = new SingletonBasic();
				}
			}
		}
		return singletonBasic;
	}
}
