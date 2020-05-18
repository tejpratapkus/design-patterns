package com.serialzable;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SerializableSingleton singleton;

	private SerializableSingleton() {

	}

	protected Object readResolve() {
		return singleton;
	}

	public static SerializableSingleton getInstance() {
		if (singleton == null) {
			synchronized (SerializableSingleton.class) {
				if (singleton == null) {
					singleton = new SerializableSingleton();
				}

			}
		}
		return singleton;
	}

}
