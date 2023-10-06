package assignment;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two numbers :");
		if (scanner.hasNextDouble()) {
			double num1 = scanner.nextDouble();
			double num2 = scanner.nextDouble();
			System.out.println("Average is:" + (num1 + num2) / 2);
		} else
			System.out.println("Enter double value,you entered:"+scanner.next());
		scanner.close();
	}

}
