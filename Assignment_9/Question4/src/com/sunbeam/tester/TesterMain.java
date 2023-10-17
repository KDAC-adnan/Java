package com.sunbeam.tester;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.sunbeam.Book;

class BookComparator implements Comparator<Book>
{

	@Override
	public int compare(Book b1, Book b2) {
		int diff=(int)b1.getPrice()-(int)b2.getPrice();
		return -diff;
	}
	
}

public class TesterMain {

	
	public static void main(String[] args) {

		
		List<Book> library = new ArrayList<>();
		Book b;
		BookComparator bookComparator=new BookComparator();
		
		library.add(new Book("121", 122, "Dr. APJ Abdul kalam", 10));
		library.add(new Book("122", 130, "Jamses Gosling", 25));
		library.add(new Book("123", 170, "Bjarne Stroustrp", 12));
		library.add(new Book("124", 120, "Dennis Ritchie", 100));
		library.add(new Book("125", 180, "Adnan", 22));
		library.add(new Book("126", 160, "Chetan Bhagat", 10));

		Scanner scanner = new Scanner(System.in);
		Integer choice;
		try {
			do {
				System.out.println("-----------------------------------------------------------");
				System.out.println("1. Add new book in list");
				System.out.println("2. Display all books in forward order");
				System.out.println("3. Delete at book given index ");
				System.out.println("4. Check if book with given isbn is in list or not");
				System.out.println("5. Delete all books in list");
				System.out.println("6. Display number of books in list");
				System.out.println("7. Sort all books by price in desc order ");
				System.out.println("Enter from above");
				choice = scanner.nextInt();
				System.out.println("-----------------------------------------------------------");
				switch (choice) {
				case 1:
					b=new Book();
					b.accept();
					library.add(b);
					break;
				case 2:
					for(Book ele:library)
						System.out.println(ele);
					break;
				case 3:
				{
					int index;
					System.out.println("Enter index to remove book:");
					index=scanner.nextInt();
					if(index>=0 && index<library.size())
						library.remove(index-1);
					else
						System.out.println("Invalid Index");
				}
					break;
				case 4:
				{
					String isbn;
					System.out.println("Enter isbn to check:");
					isbn=scanner.next();
					b=new Book(isbn);
					if(library.contains(b))
						System.out.println("Book with isbn:"+isbn+" is in library");
					else
						System.out.println("Book with isbn:"+isbn+" is not in library");
				}
					break;
				case 5:
					library.clear();
					break;
				case 6:
					System.out.println("Number of books in library:"+library.size());
					break;
				case 7:
					library.sort(bookComparator);
					break;
				default:
					System.out.println("Enter valid choice!!");
					break;
				}

			} while (choice != 0);
		} finally {
			scanner.close();
		}
	}

}
