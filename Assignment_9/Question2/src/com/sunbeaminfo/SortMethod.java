package com.sunbeaminfo;

import java.util.Comparator;

public class SortMethod {
	
	
	
	
	static <T> void selectionSortMethod(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		class IntegerComparator implements Comparator<Integer>
		{
			@Override
			public int compare(Integer arg0, Integer arg1) {
				int diff=Integer.compare(arg0,arg1);
				return diff;
			}	
		}
		
		class DoubleComparator implements Comparator<Double>
		{
			@Override
			public int compare(Double arg0,Double arg1) {
				int diff=Double.compare(arg0,arg1);
				return diff;
			}	
		}
		
		IntegerComparator integerComparator=new IntegerComparator();
		DoubleComparator doubleComparator=new DoubleComparator();
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		System.out.println("Before sorting:");
		for(Integer ele:arr1)
			System.out.println(ele);
		selectionSortMethod(arr1,integerComparator);
		System.out.println("After sorting:");
		for(Integer ele:arr1)
			System.out.println(ele);
		
		
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		System.out.println("Before sorting:");
		for(Double ele:arr2)
			System.out.println(ele);
		selectionSortMethod(arr2,doubleComparator);
		System.out.println("Befor sorting:");
		for(Double ele:arr2)
			System.out.println(ele);
	}

}
