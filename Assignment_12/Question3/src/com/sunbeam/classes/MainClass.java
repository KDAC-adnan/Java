
package com.sunbeam.classes;

import java.util.Scanner;

import com.sunbeam.interfaces.Arithmetic;

/**
 * @author adnan -- MainClass.java -- 20-Oct-2023
 *
 */
public class MainClass {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		int choice;
		double num1, num2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter num 1:");
		num1 = scanner.nextDouble();
		System.out.print("Enter num 2:");
		num2 = scanner.nextDouble();
		do {
			System.out.println("---------------");
			System.out.println("0.EXIT");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.print("Chose from above!!");
			choice = scanner.nextInt();
			System.out.println("---------------");
			switch (choice) {
			case 0:
				System.out.println("Exit Successfully");
				System.exit(0);
				break;
			case 1:
				calculate(num1,num2,(a,b)->a+b);
				break;
			case 2:
				calculate(num1,num2,(a,b)->a-b);
				break;
			case 3:
				calculate(num1,num2,(a,b)->a*b);
				break;
			case 4:
				calculate(num1,num2,(a,b)->a/b);
				break;
			default:
				System.out.println("Enter valid value");
				break;
			}
		} while (choice != 0);
		scanner.close();
	}

}
