package com.test.designpatterns.singleton;

public class EagerSingletonPreventCloning implements Cloneable {

	/**
	 * The serializable class EagerSerializedSingleton does not declare a static final serialVersionUID field of type long
	 */
	private static final EagerSingletonPreventCloning instance = new EagerSingletonPreventCloning();
	
	//private constructor to avoid client applications to use constructor
	private EagerSingletonPreventCloning() {
		System.out.println("This is Private Constructor of EagerSingletonPreventCloning class");
	}
	
	public static EagerSingletonPreventCloning getInstance() {
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return instance;//instead of super.clone() return instance otherwise throw CloneNotSupportedException 
	}
}
