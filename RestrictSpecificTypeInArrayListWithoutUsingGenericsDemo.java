package com.collection.list.ex;

import java.util.ArrayList;
import java.util.List;

public class RestrictSpecificTypeInArrayListWithoutUsingGenericsDemo {

	static List<Object> lst = new ArrayList<Object>();

	public static void main(String[] args) {
		addElementstoList(1);
		addElementstoList("abc");
		addElementstoList(true);
		addElementstoList('a');
		
		printElementsInList();
	}

	public static void addElementstoList(Object input) {
		System.out.println("\nAdding "+input + " of type "+ input.getClass().getSimpleName()+" to list");
		if (input instanceof String)
			System.out.println("We are not allowed to add String type in this array list");
		else
			lst.add(input);

	}
	
	public static void printElementsInList() {
		System.out.println("\nElements in the List");
		lst.forEach(System.out::println);
		
		System.out.println("\nElements in the List along with data type");
		lst.forEach((data)->System.out.println(data + " -> "+ data.getClass().getSimpleName()));
	}

}
