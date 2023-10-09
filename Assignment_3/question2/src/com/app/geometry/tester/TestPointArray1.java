package com.app.geometry.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numOfPoints;
		int choice;

		System.out.print("Enter Number of points:");
		numOfPoints = scanner.nextInt();

		Point2D[] point2D = new Point2D[numOfPoints];

		int x, y;
		for (int i = 0; i < numOfPoints; i++) {
			System.out.print("Enter x:");
			x = scanner.nextInt();
			System.out.print("Enter y:");
			y = scanner.nextInt();
			point2D[i] = new Point2D(x, y);
		}

		do {
			System.out.println("---------------------------------------------------");
			System.out.println("1.Enter index:");
			System.out.println("2.Display of x,y co-ordinates of all points");
			System.out.println("3.Enter starting and ending point");
			System.out.println("4.EXIT");
			System.out.println("Enter choice from above!!");
			choice = scanner.nextInt();
			System.out.println("---------------------------------------------------");
			switch (choice) {
			case 1: {
				int index;
				System.out.print("Enter index:");
				index = scanner.nextInt();
				if (index-1 < numOfPoints && index >= 0) {
					System.out.println(point2D[index - 1].getDetails());
				} else
					System.out.println("Invalid index , please retry!!!!");
			}
				break;
			case 2: {
				for (int i = 0; i < numOfPoints; i++) {
					System.out.println("Points on index:"+i+"("+point2D[i].getDetails()+")");
				}
			}
				break;
			case 3: {
				int startingIndex, endingIndex;
				System.out.print("Enter starting index:");
				startingIndex = scanner.nextInt();
				System.out.print("Enter ending index:");
				endingIndex = scanner.nextInt();
				if ((startingIndex-1 < numOfPoints && startingIndex-1 >= 0)
						&& (endingIndex-1 < numOfPoints && endingIndex-1 >= 0)) {
					if (point2D[startingIndex-1].isEqual(point2D[endingIndex-1])) {
						System.out.println("points are located on same index");
					} else
						System.out.println("Distance between points:"
								+ point2D[startingIndex-1].calculateDistance(point2D[endingIndex-1]));
				} else
					System.out.println("Invalid indexes,please retry!!!");

			}
				break;
			}
		} while (choice != 4);
		scanner.close();
	}

}
