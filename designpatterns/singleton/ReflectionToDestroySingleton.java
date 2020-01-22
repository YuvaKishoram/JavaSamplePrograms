package com.test.designpatterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionToDestroySingleton {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("Calling getInstance method");
		EagerInitializationSingleton obj1 = EagerInitializationSingleton.getInstance(); 
		System.out.println("Before Creating newInstance obj1 Hashcode : "+obj1);
		
		EagerInitializationSingleton obj2 = null;
		
		try {
			Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				System.out.println("\nChanging private constructor Accessiblity as true");
				constructor.setAccessible(true);
				System.out.println("Creating newInstance");
				obj2 = (EagerInitializationSingleton) constructor.newInstance();
				break;
			}
			
			System.out.println("\nComparing Hashcode after creating new instance for the Singleton class");
			System.out.println("obj1 Hashcode : "+obj1);
			System.out.println("obj2 Hashcode : "+obj2);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
