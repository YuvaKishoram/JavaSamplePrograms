package com.test.designpatterns.singleton;

public class EagerInitializationSingleton {

	private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
	
	//private constructor to avoid client applications to use constructor
	private EagerInitializationSingleton() {
		System.out.println("This is Private Constructor of EagerInitializationSingleton class");
	}
	
	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}
