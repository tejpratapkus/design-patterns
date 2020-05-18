package com.clone;

public class ParentSingeton implements Cloneable {
	
	int value = 10;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
