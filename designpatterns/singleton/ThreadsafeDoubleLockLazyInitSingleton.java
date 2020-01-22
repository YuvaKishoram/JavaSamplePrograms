package com.test.designpatterns.singleton;

public class ThreadsafeDoubleLockLazyInitSingleton {

	public static ThreadsafeDoubleLockLazyInitSingleton instance;
	
	//private constructor to avoid client applications to use constructor
	private ThreadsafeDoubleLockLazyInitSingleton() {
		System.out.println("This is Private Constructor of ThreadsafeDoubleLockLazyInitSingleton class");
	}
	
	public static ThreadsafeDoubleLockLazyInitSingleton getInstance() {
		if(instance == null) {
			synchronized(ThreadsafeDoubleLockLazyInitSingleton.class) {
			instance = new ThreadsafeDoubleLockLazyInitSingleton();
			}
		}
		return instance;
	}
}
