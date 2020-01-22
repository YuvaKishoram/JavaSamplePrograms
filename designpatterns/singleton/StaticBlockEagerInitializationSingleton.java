package com.test.designpatterns.singleton;

public class StaticBlockEagerInitializationSingleton {
	
	private static StaticBlockEagerInitializationSingleton instance = null;
	
	//static block initialization for exception handling
	static {
		try{
			instance = new StaticBlockEagerInitializationSingleton();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton class");
		}
	}
	
	//private constructor to avoid client applications to use constructor
	private StaticBlockEagerInitializationSingleton() {
		System.out.println("This is Private Constructor of StaticBlockEagerInitializationSingleton class");
	}
	
	public static StaticBlockEagerInitializationSingleton getInstance() {
		return instance;
	}
}
