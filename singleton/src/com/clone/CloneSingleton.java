package com.clone;

public class CloneSingleton extends ParentSingeton {

	private static CloneSingleton singleton;

	private CloneSingleton() {

	}

	public static CloneSingleton getInstance() {
		if (singleton == null) {
			synchronized (CloneSingleton.class) {
				if (singleton == null) {
					singleton = new CloneSingleton();
				}
			}
		}
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleton;
	}

}
