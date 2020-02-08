package com.collection.list.ex;

import java.util.ArrayList;
import java.util.List;

public class AllowSpecificTypesInArrayListNotUsingGenericsDemo {

	static List lst = new ArrayList();

	public static void main(String[] args) {
		addElementstoList(1);
		addElementstoList("abc");
		addElementstoList(true);
		addElementstoList('a');
		
		printElementsInList();
	}

	public static void addElementstoList(Object input) {
		System.out.println("Adding to list : "+input);
		if (input instanceof String)
			System.out.println("We are not allowed to add Strings in this array list");
		else
			lst.add(input);

	}
	
	public static void printElementsInList() {
		System.out.println("Elements in the List");
		lst.forEach(System.out::println);
	}

}
