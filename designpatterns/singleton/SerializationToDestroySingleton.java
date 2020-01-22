package com.test.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationToDestroySingleton {

	public static void main(String[] args) {
		
		System.out.println("Calling getInstance method");
		EagerSingletonSerialized obj1 = EagerSingletonSerialized.getInstance(); 
		System.out.println("Before Creating Serialization \nobj1 Hashcode : "+obj1);
		
		EagerSingletonSerialized obj2 = null;
		
		try {
			
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("EagerSingletonSerialized.txt"));
			out.writeObject(obj1);
			out.close();
			
			ObjectInput in = new ObjectInputStream(new FileInputStream("EagerSingletonSerialized.txt"));
			obj2 = (EagerSingletonSerialized)in.readObject();
			in.close();
			
			System.out.println("\nComparing Hashcode after creating new instance for the Singleton class using DeSerialization");
			System.out.println("obj1 Hashcode : "+obj1);
			System.out.println("obj2 Hashcode : "+obj2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
