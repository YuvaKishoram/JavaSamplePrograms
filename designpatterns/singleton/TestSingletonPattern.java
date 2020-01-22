package com.test.designpatterns.singleton;

class SimpleClass{
	//static reference variable
	private static SimpleClass simpleClass = null;
	
	//private constructor
	private SimpleClass()
	{
		System.out.println("0-arg Private Constructor");
	}
	
	//static factory method
	/*
	 * multiple threads acts on the same method 
	 * may be possible to get two create 2 instances
	 * hence mark the create method as synchronized
	 * 
	 * */
	public synchronized static SimpleClass create()
	{
		// object creating having singleton logic
		if(simpleClass==null)
		{
			System.out.println("Creating Instance");
			simpleClass = new SimpleClass();
		}
		return simpleClass;
	}
}

public class TestSingletonPattern {
	
	public static void main(String[] args) {
		//SimpleClass s = new SimpleClass();--The constructor SimpleClass() is not visible
		
		SimpleClass s1 = SimpleClass.create();
		SimpleClass s2 = SimpleClass.create();
		SimpleClass s3 = SimpleClass.create();
		
		System.out.println("S1 Object hascode::"+s1.hashCode());
		System.out.println("S2 Object hascode::"+s2.hashCode());
		System.out.println("S3 Object hascode::"+s3.hashCode());

	}
}