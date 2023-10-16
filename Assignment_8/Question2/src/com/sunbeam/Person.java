package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable {

	String name;
	int age;
	Date doj;

	public Person() {
		super();
	}

	public Person(String name, int age,int day,int month,int year) {
		doj=new Date();
		doj.setDay(day);
		doj.setMonth(month);
		doj.setYear(year);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter name:");
			name = scanner.next();
			System.out.print("Enter age:");
			age = scanner.nextInt();
		} finally {
			scanner.close();
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]"+doj.toString();
	}

	@Override
	public void Display() {
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Date of birth:"+doj.toString());
	}

}
