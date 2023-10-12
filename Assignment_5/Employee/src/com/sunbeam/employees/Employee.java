package com.sunbeam.employees;

import java.util.Scanner;

abstract public class Employee {
	String firstName;
	String lastName;
	int ssn;

	public Employee() {
	}

	public Employee(String firstName, String lastName, int ssn) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void acceptData(Scanner scanner)
	{
		System.out.print("Enter first name:");
		firstName=scanner.nextLine();
		System.out.print("Enter last name:");
		lastName=scanner.nextLine();
		System.out.println("Enter social security number");
		ssn=scanner.nextInt();
	}
	
//	@Override
//	public String toString() {
//		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
//	}

	abstract public void calculateSalary();
}
