package com.test.designpatterns.immutable;

final class SimpleClass{
	
	private int a;
	private String b;

	private final String name;
	
	public SimpleClass(int a,String b)
	{
		System.out.println("Constructor");
		this.a=a;
		this.b=b;
		this.name=b;
	}
	// write factory method when data modification is required
	public SimpleClass modifyData(int a,String b)
	{
		return new SimpleClass(a, b);
	}
	
	public SimpleClass modifyA(int a)
	{
		return new SimpleClass(a, this.b);
	}
	
	public SimpleClass modifyB(String b)
	{
		return new SimpleClass(this.a, b);
	}
	
	public void displayData()
	{
		System.out.println("a::"+a+" b::"+b);
	}
}
public class TestImmutablePattern {
	
	public static void main(String[] args) {
		SimpleClass s = new SimpleClass(10, "Kishore");
		
		s.displayData();
		System.out.println("S Object hascode::"+s.hashCode());
		
		SimpleClass s1 = s.modifyData(20, "Kishore Reddy");
		System.out.println("S1 Object hascode::"+s1.hashCode());
		s1.displayData();
		s.displayData();

		
		SimpleClass s2 = s.modifyA(30);
		System.out.println("S2 Object hascode::"+s2.hashCode());
		s2.displayData();
		s.displayData();

	}

}
