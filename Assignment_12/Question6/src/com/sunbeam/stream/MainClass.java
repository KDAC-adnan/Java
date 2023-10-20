
package com.sunbeam.stream;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author adnan -- MainClass.java -- 20-Oct-2023
 *
 */
public class MainClass {
	public static void main(String[] args) {

		int num;
		System.out.println("Enter number:");
		num=new Scanner(System.in).nextInt();
		
		int result=Stream.iterate(1, i->i+1).limit(num).reduce(1,(a,b)->a*b);
		System.out.println("Factorial is:"+result);
	}

}
