package com.sunbeam.classes;

import com.sunbeam.interfaces.Check;

public class MainClass {

	static <T> int countIf(T[] arr, T key, Check<T> c) {

		int count=0;
		for (T ele : arr)
			if (c.compare(ele, key))
				count++;
		return count;
	}

	public static void main(String[] args) {
		
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		
		int count=countIf(arr,key,(a,b)->a>b);
		System.out.println("Result:"+count);
	}

}
