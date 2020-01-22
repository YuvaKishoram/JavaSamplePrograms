package com.test.designpatterns.singleton;

import java.io.Serializable;

public class EagerSingletonPreventSerialization implements Serializable {

	/**
	 * The serializable class EagerSerializedSingleton does not declare a static final serialVersionUID field of type long
	 */
	private static final long serialVersionUID = 1L;
	private static final EagerSingletonPreventSerialization instance = new EagerSingletonPreventSerialization();
	
	//private constructor to avoid client applications to use constructor
	private EagerSingletonPreventSerialization() {
		System.out.println("This is Private Constructor of EagerSingletonPreventSerialization class");
	}
	
	public static EagerSingletonPreventSerialization getInstance() {
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
}
