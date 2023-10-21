package com.sunbeam;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;

public class MainClass {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("./Data/practice.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null)
					System.out.println(line);
			}
		} catch (EOFException e) {

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
