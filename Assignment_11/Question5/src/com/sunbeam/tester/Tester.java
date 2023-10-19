package com.sunbeam.tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.sunbeam.Book;

public class Tester {

	public static int menu(Scanner scanner) {
		int choice;
		System.out.println("-------------------");
		System.out.println("0.EXIT");
		System.out.println("1.Insert in map");
		System.out.println("2.Find in map");
		System.out.println("3.Display all books");
		choice = scanner.nextInt();
		System.out.println("-------------------");
		return choice;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		/**We don't need to override hashCode and equals method in book because
		 * our key type is of String(Wrapper class)
		 * **/
		Map<String, Book> map = new HashMap<>();
		Book book;
		int choice;
		/**Hard coded value added for testing purpose only*/
		book = new Book("126", 160, "Chetan Bhagat", 10);
		map.put(book.getIsbn(), book);
		book = new Book("123", 170, "Bjarne Stroustrp", 12);
		map.put(book.getIsbn(), book);
		book = new Book("125", 180, "Adnan", 22);
		map.put(book.getIsbn(), book);
		book = new Book("121", 122, "Dr. APJ Abdul kalam", 10);
		map.put(book.getIsbn(), book);
		book = new Book("122", 120, "Dennis Ritchie", 100);
		map.put(book.getIsbn(), book);
		book = new Book("126", 160, "Chetan Bhagat", 10);
		map.put(book.getIsbn(), book);
		book = new Book("126", 160, "AAAACVF", 10);
		map.put(book.getIsbn(), book);
		book = new Book("122", 130, "Jamses Gosling", 25);
		map.put(book.getIsbn(), book);
		try {
			while ((choice = menu(scanner)) != 0) {
				switch (choice) {
				case 1:// Insert book in map
				{
					Book book2 = new Book();
					book2.acceptData(scanner);
					Book b1 = map.put(book2.getIsbn(), book2);
					if (b1 == null)
						System.out.println("Book Added Successfully");
					else
						System.out.println("Book already exists");
				}
					break;
				case 2:// Find in map
					String isbn;
					System.out.println("Enter isbn");
					scanner.nextLine();
					isbn = scanner.nextLine();
					if(map.get(isbn)!=null)
						System.out.println(map.get(isbn));
					else
						System.out.println("No book in collection with isbn:"+isbn);
					break;
				case 3://Display all book using entry set
					Set<Entry<String, Book>> e = map.entrySet();
					for (Entry<String, Book> b : e)
						System.out.println(b.getKey() + "---->" + b.getValue());
					break;
				default:
					System.out.println("Enter valid value");
					break;
				}
			}
		} finally {
			scanner.close();
		}
		System.out.println("Byee!!");
	}

}
