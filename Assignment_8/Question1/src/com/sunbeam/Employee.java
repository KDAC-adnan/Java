package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	private int empid;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name,int age,int empid, double salary) {
		super(name,age);
		this.empid = empid;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

		
	@Override
	public String toString() {
		return super.toString()+"Employee [empid=" + empid + ", salary=" + salary + "]";
	}

	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter empid:");
		empid = new Scanner(System.in).nextInt();
		System.out.print("Enter salary:");
		salary = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public double calCulateSalary() {
		return this.salary;
	}
}
