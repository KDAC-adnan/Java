package com.sunbeam;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesterStream {

	public static void main(String[] args) {
		IntStream intStream1 = IntStream.iterate(1, x -> x + 1).limit(10);
		/*
		 * Output intStream1.forEach(x->System.out.print(x+" "));
		 *
		 * Output--1 2 3 4 5 6 7 8 9 10
		 */
		/*
		 * Output
		 * int sum=intStream1.sum(); 
		 * System.out.println("Sum:"+sum);
		 */
		System.out.println(intStream1.summaryStatistics());
		//Output -- IntSummaryStatistics{count=10, sum=55, min=1, average=5.500000, max=10}
	}

}
