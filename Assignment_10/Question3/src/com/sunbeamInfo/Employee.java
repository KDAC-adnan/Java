package com.sunbeamInfo;

import java.util.Scanner;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId)
	{
		this.empId=empId;
	}
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	public void accept(Scanner scanner)
	{
		System.out.print("Enter employee id:");
		this.empId=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter employee name:");
		this.name=scanner.nextLine();
		System.out.print("Enter employee salary:");
		this.salary=scanner.nextDouble();
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Employee)
		{
			Employee employee=(Employee)obj;
			return this.empId==employee.empId;
		}
		return false;
	}
}
