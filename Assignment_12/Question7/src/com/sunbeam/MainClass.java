package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

// Write a program to calculate sum of 10 random integers using streams
public class MainClass {

	public static void main(String[] args) {
		
		Random r=new Random();
		int result=Stream.generate(()->r.nextInt(10)).limit(10).reduce(0,(x,y)->x+y);
		System.out.println(result);
	}

}
