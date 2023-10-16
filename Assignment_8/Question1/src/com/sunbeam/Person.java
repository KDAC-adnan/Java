package com.sunbeam;

import java.util.Scanner;

abstract public class Person {
	
	String name;
	int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
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
	
	public void acceptData()
	{
		System.out.print("Enter name:");
		name=new Scanner(System.in).next();
		System.out.print("Enter age:");
		age=new Scanner(System.in).nextInt();
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	abstract public double calCulateSalary();
}
