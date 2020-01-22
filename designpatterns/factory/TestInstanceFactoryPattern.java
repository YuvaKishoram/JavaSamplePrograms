package com.test.designpatterns.factory;

class SimpleClass{
	
	int a;
	float b;

	SimpleClass(int a,float b)
	{
		System.out.println("Constructor");
		this.a=a;
		this.b=b;
	}
	
	public void modifyData()
	{
		a=a*a;
		b=b*b;
	}
	
	public void displayData()
	{
		System.out.println("a::"+a+" b::"+b);
	}
}

public class TestInstanceFactoryPattern {
	
	public static void main(String[] args) {
		SimpleClass s = new SimpleClass(10, 5);
		
		s.displayData();
		System.out.println("S Object hascode::"+s.hashCode());
		
		s.modifyData();
		

		s.displayData();
		System.out.println("S Object hascode::"+s.hashCode());
	}

}
