package com.test.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationPreservesSingleton {

	public static void main(String[] args) {
		
		System.out.println("Calling getInstance method");
		EagerSingletonPreventSerialization obj1 = EagerSingletonPreventSerialization.getInstance(); 
		System.out.println("Before Creating Serialization \nobj1 Hashcode : "+obj1);
		
		EagerSingletonPreventSerialization obj2 = null;
		
		try {
			
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("EagerSingletonPreventSerialization.txt"));
			out.writeObject(obj1);
			out.close();
			
			ObjectInput in = new ObjectInputStream(new FileInputStream("EagerSingletonPreventSerialization.txt"));
			obj2 = (EagerSingletonPreventSerialization)in.readObject();
			in.close();
			
			System.out.println("\nComparing Hashcode after creating new instance for the Singleton class using DeSerialization");
			System.out.println("obj1 Hashcode : "+obj1);
			System.out.println("obj2 Hashcode : "+obj2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
