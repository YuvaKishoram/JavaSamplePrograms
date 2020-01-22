package com.test.designpatterns.singleton;

public class ThreadsafeLazyInitSingleton {

	public static ThreadsafeLazyInitSingleton instance;
	
	//private constructor to avoid client applications to use constructor
	private ThreadsafeLazyInitSingleton() {
		System.out.println("This is Private Constructor of ThreadsafeLazyInitSingleton class");
	}
	
	public static synchronized ThreadsafeLazyInitSingleton getInstance() {
		if(instance == null)
			instance = new ThreadsafeLazyInitSingleton();

		return instance;
	}
}
