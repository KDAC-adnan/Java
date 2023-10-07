package com.sunbeaminfo.employee;

import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;
	Scanner scanner=new Scanner(System.in);
		
	public Employee() {
	
	}
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary>0)
			this.monthlySalary = monthlySalary;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary>0)
			this.monthlySalary = monthlySalary;
	}
	
	public void acceptData()
	{
		System.out.println("Enter first name:");
		this.firstName=scanner.nextLine();
		System.out.println("Enter last name:");
		this.lastName=scanner.nextLine();
		System.out.println("Enter monthly salary :");
//		if(scanner.nextDouble()>0)
			this.monthlySalary=scanner.nextDouble();
	}
	
	public void displayData()
	{
		System.out.println("First name:"+this.firstName);
		System.out.println("Last name:"+this.lastName);
		System.out.println("Monthly salary:"+this.monthlySalary);
	}
}
