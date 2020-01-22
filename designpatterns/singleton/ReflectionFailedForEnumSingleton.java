package com.test.designpatterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionFailedForEnumSingleton {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		System.out.println("Accessing Instance variable");
		EnumSingleton obj1 = EnumSingleton.INSTANCE; 
		System.out.println("Before Creating newInstance obj1 Hashcode : "+obj1);
		
		EnumSingleton obj2 = null;
		
		try {
			Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : constructors) {
				System.out.println("\nChaning Accessiblity as true\n");
				constructor.setAccessible(true);
				System.out.println("Trying to Create newInstance");
				obj2 = (EnumSingleton) constructor.newInstance();
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