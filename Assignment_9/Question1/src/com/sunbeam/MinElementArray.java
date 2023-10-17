package com.sunbeam;

public class MinElementArray {

	static <T extends Number> T findMin(T[] arr) {
		T min = arr[0];
		//for (int i = 1; i < arr.length; i++) {
		for(T ele:arr) {
			if (min.doubleValue() > ele.doubleValue()) 
				min = ele;

		}
		return min;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 10,22, 55, 77, 11, 33, -12,44};
		Integer min1 = findMin(arr1);
		System.out.println("Minimum element in Integer array:"+min1);
		Double[] arr2 = { 2.2, 5.5, 7.7,-1.2,-2.4,-2.6,1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println("Minimum element in Double array:"+min2);
		Byte[] arr3= {-6,1,0,2,7,5,4};
		Byte min3=findMin(arr3);
		System.out.println("Minimum element in Byte array:"+min3);
		Long[] arr4= {122222L,12388382L,1239393L,2939302L};
		Long min4=findMin(arr4);
		System.out.println("Minimum element in Long array:"+min4);
		
		
//		int[] arr1 = { 10,22, 55, 77, 11, 33, -12,44};
//		for(int ele:arr1)
//			System.out.println(ele);
		
	}

}
