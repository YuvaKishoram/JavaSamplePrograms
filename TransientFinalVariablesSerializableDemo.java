package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientFinalVariablesSerializableDemo implements Serializable{
	
	/*
	 * https://www.benchresources.net/transient-keyword-with-final-variable-in-java-serialization/
	 * 
	 * http://blog.clempinch.com/transient-and-final-instance-variables-in-java/
	 * 
	 * Constant Expressions
	 * https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.28
	 */
	
	
	private static final long serialVersionUID = -8080022537794437432L;

	
	//For regular non-final transient instance variable, they are assigned with their default values.
	private transient String nonFinalTransient = "ABC";
	private final String nonTransientFinal = "XYZ";
	
	
	// final variable is blank, meaning it is initialized in the object constructor, the Deserialization will put the default value as null.
	private final transient String finalBlankVariable;
	
	private final transient String strObject= new String("Reddy");
	
	/*
	 * A constant expression is an expression, which can be resolved at compile-time
	 * with no ambiguity: It should gives the guarantee that the resulting value
	 * will never change during the execution.
	 */
	private final transient String strLiteral = "Kishore";
	private final transient String strLiteralAppendedWithConstant = strLiteral+ " P";
	
	
	private final transient String strLiteralAppendedWithStrObjectAndConstant = strLiteral+ strObject + " P";
	
	
	private transient int nonFinalTransientInt = 123;
	private final int nonTransientFinalInt = 789;
	
	private final transient int intConstant = 7;
	private final transient int intConstantMultipliedByAnotherConstant = 7 * 3;
	private final transient int intConstantReferenceToAnotherIntConstant = Integer.MIN_VALUE;
	private final transient int[] intArray = {1,2,3};
	private final transient int castFloatToInt = (int)3.5;
	
	@Override
	public String toString() {
		return "\nString nonFinalTransient = "+nonFinalTransient+
				"\nString nonTransientFinal = "+nonTransientFinal+"\n"+
				"\nString Literal Variable strLiteral = "+strLiteral+
				"\nString final Blank Variable finalBlankVariable = "+finalBlankVariable+
				"\nString Object Reference Variable created using new String() strObject = "+strObject+
				"\nString strLiteralAppendedWithConstant = "+strLiteralAppendedWithConstant+
				"\nString strLiteralAppendedWithStrObjectAndConstant = "+strLiteralAppendedWithStrObjectAndConstant+
				"\nString castFloatToInt = "+castFloatToInt+
				"\n"+
				"\nint nonFinalTransientInt = "+nonFinalTransientInt+
				"\nint nonTransientFinalInt = "+nonTransientFinalInt+"\n"+
				"\nint intConstant = "+intConstant+
				"\nint intConstantMultipliedByAnotherConstant = "+intConstantMultipliedByAnotherConstant+
				"\nint intConstantReferenceToAnotherIntConstant = "+intConstantReferenceToAnotherIntConstant+
				"\nint intArray = "+intArray;
	}
	TransientFinalVariablesSerializableDemo(){
		finalBlankVariable = "abc";//During Deserialization, the constructor of the object is not called. 
	}
	public static void main(String[] args) {

		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("check.ser"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("check.ser"));){
			TransientFinalVariablesSerializableDemo obj1 = new TransientFinalVariablesSerializableDemo();
			
			System.out.println("===== Before Serialization Values =====");
			System.out.println(obj1);
			
			out.writeObject(obj1);
			
			TransientFinalVariablesSerializableDemo obj2 = (TransientFinalVariablesSerializableDemo)in.readObject();
			System.out.println();

			System.out.println("===== After DeSerialization Values =====");
			System.out.println(obj2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
