package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try (FileWriter fout = new FileWriter("./Data/practice.txt")) {
			try (BufferedWriter bwr = new BufferedWriter(fout)) {
					for (int i = 0; i < 4; i++) {
						System.out.print("Enter:");
						String line=scanner.nextLine();
						bwr.write(line+"\n");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
