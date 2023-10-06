package question_3;

import java.util.Scanner;

public class FoodMenu {

	public static int menu() {
		int choice;
		Scanner scanner = new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Idli");
		System.out.println("2.Dosa");
		System.out.println("3.Smaosa");
		System.out.println("4.Swarma");
		System.out.println("5.Thali");
		System.out.println("6.Chicken tikka");
		System.out.println("7.Chicken curry");
		System.out.println("8.Chicken Biryani");
		System.out.println("9.Mutton Korma");
		System.out.println("10.Paneer tikka");
		System.out.println("Generate Bill!!");
		System.out.println("Select from above");
		choice = scanner.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bill = 0;
		int choice;
		 A:while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				bill+=30;
				break;
			case 2:
				bill+=30;
				break;
			case 3:
				bill+=20;
				break;
			case 4:
				bill+=80;
				break;
			case 5:
				bill+=100;
				break;
			case 6:
				bill+=200;
				break;
			case 7:
				bill+=240;
				break;
			case 8:
				bill+=140;
				break;
			case 9:
				bill+=340;
				break;
			case 10:
				bill+=140;
				break;
			case 11:
				break A;
			}
		}
		System.out.println("Bill :"+bill);
	}

}
