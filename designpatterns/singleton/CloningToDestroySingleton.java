package com.test.designpatterns.singleton;

public class CloningToDestroySingleton {

	public static void main(String[] args) {
		
		System.out.println("Calling getInstance method");
		EagerSingletonCloned obj1 = EagerSingletonCloned.getInstance(); 
		System.out.println("Before Cloning \nobj1 Hashcode : "+obj1);
		
		EagerSingletonCloned obj2 = null;
		
		try {
			
			obj2 = (EagerSingletonCloned)obj1.clone();
			
			System.out.println("\nComparing Hashcode after Cloning new instance for the Singleton class");
			System.out.println("obj1 Hashcode : "+obj1);
			System.out.println("obj2 Hashcode : "+obj2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
