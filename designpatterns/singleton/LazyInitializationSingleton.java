package com.test.designpatterns.singleton;

public class LazyInitializationSingleton {

	public static LazyInitializationSingleton instance;
	
	//private constructor to avoid client applications to use constructor
	private LazyInitializationSingleton() {
		System.out.println("This is Private Constructor of LazyInitializationSingleton class");
	}
	
	public static LazyInitializationSingleton getInstance() {
		if(instance == null)
			instance = new LazyInitializationSingleton();

		return instance;
	}
}
