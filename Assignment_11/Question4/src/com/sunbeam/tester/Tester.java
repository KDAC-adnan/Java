package com.sunbeam.tester;

import java.util.Iterator;
import java.util.TreeSet;

import com.sunbeam.Book;
import com.sunbeam.comparators.BookIsbnComparator;

public class Tester {

	public static void main(String[] args) {

		TreeSet<Book> bookList = new TreeSet<>(new BookIsbnComparator());
		bookList.add(new Book("126", 160, "Chetan Bhagat", 10));
		bookList.add(new Book("123", 170, "Bjarne Stroustrp", 12));
		bookList.add(new Book("125", 180, "Adnan", 22));
		bookList.add(new Book("121", 122, "Dr. APJ Abdul kalam", 10));
		bookList.add(new Book("122", 120, "Dennis Ritchie", 100));
		bookList.add(new Book("122", 130, "Jamses Gosling", 25));

//		Iterator<Book> itr = bookList.iterator();
//		while (itr.hasNext())
//			System.out.println(itr.next());

		/**
		 * Output -- In decreasing order of price
		 * ======================================================== Book [isbn=125,
		 * price=180.0, authorName=Adnan, quantity=22] Book [isbn=123, price=170.0,
		 * authorName=Bjarne Stroustrp, quantity=12] Book [isbn=126, price=160.0,
		 * authorName=Chetan Bhagat, quantity=10] Book [isbn=122, price=130.0,
		 * authorName=Jamses Gosling, quantity=25] Book [isbn=121, price=122.0,
		 * authorName=Dr. APJ Abdul kalam, quantity=10] Book [isbn=122, price=120.0,
		 * authorName=Dennis Ritchie, quantity=100]
		 * 
		 */

		Iterator<Book> itr2 = bookList.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		/**
		 * Output using descending iterator
		 * =================================================================
		 * 	Book [isbn=122, price=120.0, authorName=Dennis Ritchie, quantity=100]
			Book [isbn=121, price=122.0, authorName=Dr. APJ Abdul kalam, quantity=10]
			Book [isbn=122, price=130.0, authorName=Jamses Gosling, quantity=25]
			Book [isbn=126, price=160.0, authorName=Chetan Bhagat, quantity=10]
			Book [isbn=123, price=170.0, authorName=Bjarne Stroustrp, quantity=12]
			Book [isbn=125, price=180.0, authorName=Adnan, quantity=22]
		 **/
	}

}
