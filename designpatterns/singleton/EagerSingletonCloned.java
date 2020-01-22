package com.test.designpatterns.singleton;

public class EagerSingletonCloned implements Cloneable {

	/**
	 * The serializable class EagerSerializedSingleton does not declare a static final serialVersionUID field of type long
	 */
	private static final EagerSingletonCloned instance = new EagerSingletonCloned();
	
	//private constructor to avoid client applications to use constructor
	private EagerSingletonCloned() {
		System.out.println("This is Private Constructor of EagerSingletonCloned class");
	}
	
	public static EagerSingletonCloned getInstance() {
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
