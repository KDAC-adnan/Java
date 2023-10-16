package com.sunbeam.test;

import com.sunbeam.Displayable;
import com.sunbeam.Person;
class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}

public class Test {

	public static void printDisplayableBox(Box<? extends Displayable> b) {
		b.getObj().Display();
	}
	
	public static void printAnyBox(Box<?> b) {
		System.out.println(b.getObj().toString());
		}
	
	public static void main(String[] args) {
		Box<Person> b=new Box<Person>();
		Person p1=new Person("Adnan",12,12,01,2023);
		b.setObj(p1);
		printDisplayableBox(b);
		printAnyBox(b);
		
		Box<String> b3=new Box<>();
		//printDisplayableBox(b3);
		printAnyBox(b);
		printAnyBox(b3);
	}

}
