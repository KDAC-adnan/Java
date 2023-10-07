package com.app.test;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int x1,x2,y1,y2;
		System.out.print("Enter x1:");
		x1=scanner.nextInt();
		System.out.print("Enter y1:");
		y1=scanner.nextInt();
		System.out.print("Enter x2:");
		x2=scanner.nextInt();
		System.out.print("Enter y2:");
		y2=scanner.nextInt();
		
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		System.out.println("p1("+p1.getDetails()+")");
		System.out.println("p2("+p2.getDetails()+")");
		
		if(p1.isEqual(p2))
			System.out.println("Both point are on same position");
		else
			System.out.println("Distance between p1 and p2:"+p1.calculateDistance(p2));
		scanner.close();
	}

}
