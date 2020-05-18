package com.serialzable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableRun {

	public static void main(String[] args) {

		try {
			SerializableSingleton singleton = SerializableSingleton.getInstance();
			ObjectOutput output = new ObjectOutputStream(new FileOutputStream("/Users/tej/Documents/Bipin.jpeg"));
			output.writeObject(singleton);
			output.close();
			ObjectInput input = new ObjectInputStream(new FileInputStream("/Users/tej/Documents/Bipin.jpeg"));
			SerializableSingleton singleton2 = (SerializableSingleton) input.readObject();
			input.close();

			System.out.println("1st Object Reference : " + singleton.hashCode());
			System.out.println("2nd Object Reference : " + singleton2.hashCode());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
