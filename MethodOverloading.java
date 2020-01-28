package com.sample;

public class MethodOverloading {

	/* Constructors Overloading - Starts */
	MethodOverloading() {
		System.out.println("Default constructor without parameters");
	}

	MethodOverloading(int rollNumber, String name) {
		System.out.println("Overloaded constructor (int rollNumber, String name)");
	}

	MethodOverloading(String rollNumber, String name) {
		System.out.println("Overloaded constructor (String rollNumber, String name) - Change in Data type of parameters");
	}
	MethodOverloading(String name, int rollNumber) {
		System.out.println("Overloaded constructor (String name, int rollNumber) - Change in sequence/order of Data type of parameters");
	}

	MethodOverloading(int rollNumber, String firstName, String laststName) {
		System.out.println("Overloaded constructor (int rollNumber, String firstName, String laststName) - Change in Number of parameters ie one more parameter added");
	}

	/* Constructors Overloading - Ends */
	
	/*
	 * Three ways to overload a method
	 * 1. Number of parameters – Different Number of parameters in argument list
	 * 2. Data type of parameters – Difference in data type of parameters
	 * 3. Sequence of Data type of parameters – Sequence of data type of arguments
	 */
	
	static void sum() {
		System.out.println("Inside sum() - No parameters");
	}

	/* Return Type has no importance in Method Overloading
	 * the following one will give compile time error - Duplicate method sum() in type MethodOverloading
	 
	static String sum() {
		System.out.println("Inside sum() - No parameters");
		return "Returning String";
	}
	 */
	static int sum(int a, int b) {
		System.out.println("Inside sum(int a, int b) Received Input Received Input a=" + a + " & b=" + b);
		return a + b;
	}

	static int sum(int a, int b, int c) {
		System.out.println("Inside sum(int a, int b, int c) Received Input a=" + a + " & b=" + b + " & c=" + c);
		return a + b + c;
	}

	static float sum(float a, float b) {
		System.out.println("Inside sum(float a, float b) Received Input a=" + a + " & b=" + b);
		return a + b;
	}

	static long sum(long a, long b) {
		System.out.println("Inside sum(long a, long b) Received Input a=" + a + " & b=" + b);
		return a + b;
	}

	static double sum(double a, double b) {
		System.out.println("Inside sum(double a, double b) Received Input a=" + a + " & b=" + b);
		return a + b;
	}

	static double sum(double a, double b, double c) {
		System.out.println("Inside sum(double a, double b, double c) Received Input a=" + a + " & b=" + b + " & c=" + c);
		return a + b + c;
	}

	static String sum(String a, String b) {
		System.out.println("Inside sum(String a, String b) Received Input a=" + a + " & b=" + b);
		return a + b;
	}

	static String sum(String... args) {
		System.out.println("Inside sum(String... args)");

		String name = "";
		for (int i = 0; i < args.length; i++)
			name = args[i] + " ";
		
		return name;
	}

	public void getChannel(int channelNo1) {
		getChannel(0, 0, channelNo1);
	}

	public void getChannel(int channelNo1, int channelNo2) {
		getChannel(0, channelNo1, channelNo2);
	}

	public void getChannel(int channelNo1, int channelNo2, int channelNo3) {
	}

	public int returnTypeOverload(int a, int b) {
		return a+b;
	}

	// Generally return type is not considered as part of overloading;
	// but here the return type will be considered
	public char returnTypeOverload(int a) {
		return (char) a;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("Constructors Overloading Examples");
		System.out.println();
		
		MethodOverloading m = new MethodOverloading();
		MethodOverloading m1 = new MethodOverloading(1, "Kishore");
		MethodOverloading m2 = new MethodOverloading("#1", "Kishore");
		MethodOverloading m3 = new MethodOverloading("Kishore", 1);
		MethodOverloading m4 = new MethodOverloading(1, "Kishore", "Reddy");

		System.out.println();

		
		// https://cs.fit.edu/~ryan/java/language/java-data.html

		/*
		 * https://beginnersbook.com/2017/08/data-types-in-java/
		 *  
		 * Non-primitive data types – Arrays , Strings , User defined classes are non-primitive data types
		 *  
		 * Primitive data types - In Java, we have 8 primitive data types: boolean, char, byte, short, int,
		 * long, float and double. Java developers included these data types to maintain
		 * the portability of java as the size of these primitive data types do not
		 * change from one operating system to another.
		 * 
		 * byte, short, int and long data types are used for storing whole numbers.
		 * 
		 * float and double are used for fractional numbers.
		 * 
		 * char is used for storing characters(letters).
		 * 
		 * boolean data type is used for variables that holds either true or false.
		 */
		
		/*
		 * What if the exact prototype does not match with arguments?
		 *  
		 * Ans. Priority wise, compiler take these steps:
		 * 
		 * Type Conversion but to higher type(in terms of range) in same family. Type
		 * conversion to next higher family(suppose if there is no long data type
		 * available for an int data type, then it will search for the float data type).
		 */
		
		 /*
		 * Method Overloading and Type Promotion When a data type of smaller size is
		 * promoted to the data type of bigger size than this is called type promotion,
		 * for example: byte data type can be promoted to short, a short data type can
		 * be promoted to int, long, double etc.
		 */
		
		 /* https://beginnersbook.com/2013/05/method-overloading/
		  *  Type Promotion table: The data type on the left side can be promoted to the
		 * any of the data type present in the right side of it.
		 * 
		 * byte → short → int → long
		 * short → int → long
		 * int → long → float → double
		 * float → double
		 * long → float → double
		 */ 
		 
		/*
		 * What it has to do with method overloading? Well, it is very important to
		 * understand type promotion else you will think that the program will throw
		 * compilation error but in fact that program will run fine because of type
		 * promotion.
		 */

		/*
		 * What is the advantage? We don’t have to create and remember different names
		 * for functions doing the same thing. For example, in our code, if overloading
		 * was not supported by Java, we would have to create method names like sum1,
		 * sum2, … or sum2Int, sum3Int, … etc.
		 */
		
		System.out.println("Method Overloading Examples");
		System.out.println();
		
		sum();

		byte b1 = 4, b2 = 5;
		int i1 = 1, i2 = 2, i3 = 3;

		System.out.println("\nAdding byte b1 = 4, b2 = 5; ");
		System.out.println("Note : Since we dont have the sum(byte a, byte b) method; "
				+ "byte will be converted/promoted as int then it will call sum(int a, int b)");
		System.out.println("Result (a+b) = " + sum(b1, b2));
		
		System.out.println("\nAdding int i1 = 1, i2 = 2; ");
		System.out.println("Result (a+b) = " + sum(i1, i2));
		
		System.out.println("\nAdding int i1 = 1, i2 = 2, i3 = 3; ");
		System.out.println("Result (a+b+c) = " + sum(i1, i2, i3));

		System.out.println("\nAdding int constants 1, 2, 3");
		System.out.println("Result (a+b+c) = " + sum(1, 2, 3));

		System.out.println("\nAdding double constants 1.0, 2.0, 3.0");
		System.out.println("Result (a+b+c) = " + sum(1.0, 2.0, 3.0));

		System.out.println("\nAdding int,long,float constants 1, 2L, 3f");
		System.out.println("Note : Since we dont have the sum(int a, long b,float c) method; "
				+ "int,long,float will be converted/promoted as double then it will call sum(double a, double b, double c)");
		System.out.println("Result (a+b+c) = " + sum(1, 2L, 3f));
		
		System.out.println("\nAdding float constants 1.5f, 2f");
		System.out.println("Result (a+b) = " + sum(1.5f, 2f));

		System.out.println("\nAdding long constants 1L, 2L");
		System.out.println("Result (a+b) = " + sum(1L, 2L));

		System.out.println("\nAdding long,float constants 1L, 2f");
		System.out.println("Note : Since we dont have the sum(long a, float b) method; "
				+ "long will be converted/promoted as float then it will call sum(float a, float b)");
		System.out.println("Result (a+b) = " + sum(1L, 2f));

		System.out.println("\nContactinating String constants Kishore , Reddy");
		System.out.println("Result (a+b) = " + sum("Kishore", "Reddy"));

		System.out.println("\nContactinating String constants Kishore , Reddy, P using var args");
		System.out.println("Result (a+b) = " + sum("Kishore", "Reddy", "P"));
	}
}