package com.test.designpatterns.singleton;

public class BillPughLazyInitInnerClassSingleton {

	public static final BillPughLazyInitInnerClassSingleton instance = new BillPughLazyInitInnerClassSingleton();
	
	//private constructor to avoid client applications to use constructor
	private BillPughLazyInitInnerClassSingleton() {
		System.out.println("This is Private Constructor of BillPughLazyInitInnerClassSingleton class");
	}
	
	private static class SingletonHelper{
		private static final BillPughLazyInitInnerClassSingleton instance = new BillPughLazyInitInnerClassSingleton();
	}
	
	public static BillPughLazyInitInnerClassSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
