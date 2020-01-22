package com.test.designpatterns.singleton;

public enum EnumSingleton {

	INSTANCE;
	
	private String country = "UK";
	private static String location = "England";
	
	public void instanceMethod() {
		System.out.println("This is instanceMethod() method country : "+country);
	}
	
	public static void staticMethod() {
		System.out.println("This is staticMethod() method country : "+location);
	}
}
