package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasketTester {

	public static int menu() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("---Fruits Shope---");
		System.out.println("0.EXIT");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display name of fruits");
		System.out.println("5.Display all fruits properties");
		System.out.println("6.Display all stale fruits in basket");
		System.out.println("7.Marks a fruit stale");
		System.out.println("8.Mark all sour fruits stale");
		System.out.print("Choice from above:");
		int choice = scanner.nextInt();
		System.out.println("------------------");
		return choice;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your bucket size:");
		int size = scanner.nextInt();
		int counter = 0;

		Fruits basket[] = new Fruits[size];

		int choice = 0;
		while ((choice = menu()) != 0) {
			switch (choice) {
			// Add Mango in basket
			case 1: {
				if (counter < size) {
					basket[counter] = new Mango();
					basket[counter].accept();
					counter++;
					System.out.println("Mango picked");
				} else
					System.out.println("Basket is full!!");
			}
				break;
			// Add Orange in basket
			case 2: {
				if (counter < size) {
					basket[counter] = new Orange();
					basket[counter].accept();
					counter++;
					System.out.println("Orange picked");
				} else
					System.out.println("Basket is full!!");
			}
				break;
			// Add Apple in basket
			case 3: {
				if (counter < size) {
					basket[counter] = new Apple();
					basket[counter].accept();
					counter++;
					System.out.println("Apple picked");
				} else
					System.out.println("Basket is full!!");
			}
				break;
			// Display names of all fruits
			case 4:
				for (Fruits fruit : basket) {
					if (fruit != null)
						System.out.println(fruit.getName());
					else
						break;
				}
				break;
			// Display properties of fruits
			case 5:
				for (Fruits fruit : basket) {
					if (fruit != null) {
						System.out.print(fruit);
						System.out.print(",Taste:"+fruit.taste());
						if (fruit.isFresh())
							System.out.println(",Fruit is Fresh");
						else
							System.out.println(",Fruit become stale");
					} else
						break;
				}
				break;
			case 6: {
				for (Fruits fruit : basket) {
					if (!fruit.isFresh())
						System.out.println(fruit.taste());
				}
			}
				break;
			// Make a fruit as stale
			case 7: {
				System.out.print("Enter index to set the fruit as stale:");
				int index = scanner.nextInt();
				if (index >= 0 && index < counter) {
					basket[index].setFresh(false);
				} else
					System.out.println("Invalid index!!");
			}
				break;
			case 8:
				for(Fruits fruit:basket)
				{
					if(fruit!=null)
						if(fruit.taste().equals("sour"))
							fruit.setFresh(false);
				}
				break;
			}
		}
		scanner.close();
	}
}
