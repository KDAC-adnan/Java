package com.sunbeam;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TesterMain {

	public static void main(String[] args) {

		List<Book> library = new ArrayList<>();
		Book book;
		Iterator<Book> itr;

		Scanner scanner = new Scanner(System.in);
		Integer choice;
		try {
			do {
				System.out.println("-----------------------------------------------------------");
				System.out.println("1. Add new book in list");
				System.out.println("2. Display all books in forward order");
				System.out.println("3. Search a book with given isbn");
				System.out.println("4. Delete a book at given index");
				System.out.println("5. Delete a book with given isbn");
				System.out.println("6. Reverse the list");
				System.out.println("7. Save books in ﬁle");
				System.out.println("8. Load books from ﬁle");
				System.out.println("Enter from above");
				choice = scanner.nextInt();
				System.out.println("-----------------------------------------------------------");
				switch (choice) {
				case 0:
					System.exit(0);
					break;
				case 1: {
					String isbn;
					String authorName;
					double price;
					int quantity;

					System.out.println("Enter isbn:");
					isbn = scanner.next();
					System.out.print("Enter price:");
					price = scanner.nextDouble();
					System.out.print("Enter author name:");
					scanner.nextLine();
					authorName = scanner.nextLine();
					System.out.print("Enter quantity:");
					quantity = scanner.nextInt();
					library.add(new Book(isbn, price, authorName, quantity));
				}
					break;
				case 2: {
					itr = library.iterator();
					while (itr.hasNext()) {
						System.out.println(itr.next());
					}
				}
					break;
				case 3: {
					String isbn;
					System.out.println("Enter isbn:");
					isbn = scanner.next();
					book = new Book(isbn);
					int index = library.indexOf(book);
					if (index == -1)
						System.out.println("Book with isbn " + isbn + " not in library");
					else
						System.out.println(library.get(index).toString());
				}
					break;
				case 4: {
					int index;
					System.out.print("Enter index:");
					index = scanner.nextInt();
					if (index < 0 || index > library.size())
						System.out.println("Invalid Index");
					else
						library.remove(index);
				}
					break;
				case 5: {
					String isbn;
					System.out.println("Enter isbn:");
					isbn = scanner.next();
					book = new Book(isbn);
					int index = library.indexOf(book);
					if (index == -1)
						System.out.println("Book with isbn " + isbn + " not in library");
					else {
						System.out.println("Removed " + library.remove(index));
					}
				}
					break;
				case 6:
					Collections.reverse(library);
					break;
				case 7:
					try (FileOutputStream fout = new FileOutputStream("./Data/Books.txt")) {
						try (ObjectOutputStream oOut = new ObjectOutputStream(fout)) {
								oOut.writeObject(library);
						}
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
				case 8: {
					try (FileInputStream fin = new FileInputStream("./Data/Books.txt")) {
						try (ObjectInputStream oDin = new ObjectInputStream(fin)) {
							library=(List<Book>)oDin.readObject();
						}
					} catch (EOFException e) {
					} catch (Exception e) {
						System.out.println(e);
					}
				}
					break;
				default:
					System.out.println("Enter valid choice!!");
					break;

				}

			} while (choice != 0);
		} finally {
			scanner.close();
			library.clear();
		}
	}

}
