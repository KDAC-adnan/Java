package com.sunbeam.comparators;

import java.util.Comparator;

import com.sunbeam.Book;

public class BookIsbnComparator implements Comparator<Book>{
	@Override
	public int compare(Book b1,Book b2)
	{
		return Double.compare(b2.getPrice(),b1.getPrice());
	}
}
