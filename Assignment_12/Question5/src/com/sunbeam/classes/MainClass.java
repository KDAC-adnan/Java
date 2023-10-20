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
		
		Double [] arr = {20.0, 22.0, 25.0, 22.0, 55.0, 66.0,22.0};
		Double key = 22.0;
		
		int count=countIf(arr,key,(a,b)-> a.equals(b));
		System.out.println("Result:"+count);
	}

}
