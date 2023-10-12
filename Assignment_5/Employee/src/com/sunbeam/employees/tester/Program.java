package com.sunbeam.employees.tester;

import java.util.Scanner;

import com.sunbeam.employees.*;

public class Program {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Employee employee=null;
		
		employee=new BasePlusCommissionEmployee();
		employee.acceptData(scanner);
		System.out.println(employee);
		employee.calculateSalary();

		employee=new ComissionEmployee();
		employee.acceptData(scanner);
		System.out.println(employee);
		employee.calculateSalary();
		
		employee=new HourlyEmployee();
		employee.acceptData(scanner);
		System.out.println(employee);
		employee.calculateSalary();
		
		employee=new SalariedEmployee();
		employee.acceptData(scanner);
		System.out.println(employee);
		employee.calculateSalary();
		
		

		scanner.close();
	}

}
