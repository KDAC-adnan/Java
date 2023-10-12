package com.sunbeam.employees;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	
	double weeklySalary;


	public SalariedEmployee() {
		super();
	}


	public SalariedEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
	}


	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}

	public void acceptData(Scanner scanner)
	{
		super.acceptData(scanner);
		System.out.print("Enter weekly salary:");
		weeklySalary=scanner.nextInt();
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Salary is:"+this.weeklySalary);
	}


	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", ssn=" + ssn + "]";
	}

}
