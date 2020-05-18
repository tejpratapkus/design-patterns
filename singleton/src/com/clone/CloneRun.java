package com.clone;

public class CloneRun {

	public static void main(String[] args) {
		try {
			CloneSingleton singleton = CloneSingleton.getInstance();
			CloneSingleton singleton2 = (CloneSingleton) singleton.clone();
			System.out.println("1st Object Reference : " + singleton.hashCode());
			System.out.println("2nd Object Reference : " + singleton2.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
