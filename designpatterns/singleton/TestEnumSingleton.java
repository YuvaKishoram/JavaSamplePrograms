package com.test.designpatterns.singleton;

public class TestEnumSingleton {

	public static void main(String[] args) {

		//EnumSingleton e = new EnumSingleton();//Cannot instantiate the type EnumSingleton
		EnumSingleton instance = EnumSingleton.INSTANCE;
		
		System.out.println("instance.hashCode() "+instance.hashCode());
		
		System.out.println(instance.name());
		//System.out.println(instance.country);//The field EnumSingleton.country is not visible
		instance.instanceMethod();
		EnumSingleton.staticMethod();
	}

}
