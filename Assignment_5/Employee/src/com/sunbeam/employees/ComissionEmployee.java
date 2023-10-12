package com.sunbeam.employees;

import java.util.Scanner;

public class ComissionEmployee extends Employee {

	public ComissionEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComissionEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
		// TODO Auto-generated constructor stub
	}

	double grossSales;
	double commissionRate;
	
	public ComissionEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public void acceptData(Scanner scanner)
	{
		super.acceptData(scanner);
		System.out.print("Enter gross sales:");
		grossSales=scanner.nextDouble();
		System.out.print("Enter Commission Rate:");
		commissionRate=scanner.nextDouble();
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Salary is:"+(commissionRate*grossSales));
	}

	@Override
	public String toString() {
		return "ComissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", firstName="
				+ firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
	
}
