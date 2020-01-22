package com.test.designpatterns.singleton;

import java.io.Serializable;

public class EagerSingletonSerialized implements Serializable {

	/**
	 * The serializable class EagerSerializedSingleton does not declare a static final serialVersionUID field of type long
	 */
	private static final long serialVersionUID = 1L;
	private static final EagerSingletonSerialized instance = new EagerSingletonSerialized();
	
	//private constructor to avoid client applications to use constructor
	private EagerSingletonSerialized() {
		System.out.println("This is Private Constructor of EagerSingletonSerialized class");
	}
	
	public static EagerSingletonSerialized getInstance() {
		return instance;
	}
}
