package com.sunbeam.employees;

import java.util.Scanner;

public class BasePlusCommissionEmployee extends Employee {

	public BasePlusCommissionEmployee() {
		super();
	}

	public BasePlusCommissionEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
	}

	public BasePlusCommissionEmployee(double commissionRate, double grossSale, double baseSalary) {
		super();
		this.commissionRate = commissionRate;
		this.grossSale = grossSale;
		this.baseSalary = baseSalary;
	}

	double commissionRate;
	double grossSale;
	double baseSalary;
	
	public void acceptData(Scanner scanner)
	{
		super.acceptData(scanner);
		System.out.print("Enter commission rate:");
		commissionRate=scanner.nextDouble();
		System.out.print("Enter gross sale:");
		grossSale=scanner.nextDouble();
		System.out.print("Enter base salary:");
		baseSalary=scanner.nextDouble();
	}
	@Override
	public void calculateSalary() {
		System.out.println("Salary is:"+(((commissionRate*grossSale))+baseSalary));
	}
	
	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [commissionRate=" + commissionRate + ", grossSale=" + grossSale
				+ ", baseSalary=" + baseSalary + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn
				+ "]";
	}
}
