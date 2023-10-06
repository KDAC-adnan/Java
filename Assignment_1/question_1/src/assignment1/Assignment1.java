package assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("Enter any number:");
		num=scanner.nextInt();
		System.out.println("Given number:"+num);
		System.out.println("Binary Equivalent:"+Integer.toBinaryString(num));
		System.out.println("Octal Equivalent:"+Integer.toOctalString(num));
		System.out.println("Hexadecimal Equivalent:"+Integer.toHexString(num));
		scanner.close();
	}

}
