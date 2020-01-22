package com.test.designpatterns.singleton;

public class EagerSingletonReflectionFailed {

	private static final EagerSingletonReflectionFailed instance = new EagerSingletonReflectionFailed();
	
	//private constructor to avoid client applications to use constructor
	private EagerSingletonReflectionFailed() {
		System.out.println("This is Private Constructor of EagerSingletonReflectionFailed class");
		
		if(instance!=null)
			throw new IllegalStateException("Singleton instance already Initialized");
		
	}
	
	public static EagerSingletonReflectionFailed getInstance() {
		return instance;
	}
}
