package com.sunbeam.employees;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	
	double hourlyWages;
	double hourWorked;
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String firstName, String lastName, int ssn) {
		super(firstName, lastName, ssn);
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(double hourlyWages, int hourWorked) {
		super();
		this.hourlyWages = hourlyWages;
		this.hourWorked = hourWorked;
	}

	public void acceptData(Scanner scanner)
	{
		super.acceptData(scanner);
		System.out.print("Enter hours workes:");
		hourWorked=scanner.nextDouble();
		System.out.print("Enter hours wages:");
		hourlyWages=scanner.nextDouble();
	}
	@Override
	public void calculateSalary() {
		if(hourWorked<=40)
		{
			System.out.println("Salary is:"+(hourlyWages*hourWorked));
		}
		else
		{
			System.out.println("Salary is:"+(40*hourlyWages+(hourWorked-40)*hourlyWages*1.5));
		}
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [hourlyWages=" + hourlyWages + ", hourWorked=" + hourWorked + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}

}
