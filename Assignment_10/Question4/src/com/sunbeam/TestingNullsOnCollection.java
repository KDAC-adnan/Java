package com.sunbeam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Collection;

public class TestingNullsOnCollection {

	public static void main(String[] args) {
		
		/**
		 *Null values are allowed in ArrayList and can be added multiple times
		 **/
		Collection<String> c = new ArrayList<>();
		
		/**
		 * Null values are allowed in HashSet but only one null value will be added
		 * to the HashSet if we try to add multiple times
		 * */
		//Collection<String> c = new HashSet<>();
		
		/**
		 *Null values are allowed in LinkedHashSet but only one null value will be added
		 * to the LinkdeHashSet if we try to add multiple times
		 *  
		 * */
		//Collection<String> c = new LinkedHashSet<>();
		
		/**
		 * Null values cannot be added to TreeSet ,if we try to add Null value in TreeSet
		 * it will throw an NullValueException
		 * */
		//Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}

}
