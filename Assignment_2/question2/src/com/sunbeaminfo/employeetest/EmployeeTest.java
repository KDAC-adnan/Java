package com.sunbeaminfo.employeetest;

import com.sunbeaminfo.employee.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.acceptData();
		employee1.displayData();
		System.out.println("Yearly Salary:" + 12 * employee1.getMonthlySalary());
		Employee employee2 = new Employee();
		employee2.acceptData();
		employee2.displayData();
		System.out.println("Yearly Salary:" + 12 * employee2.getMonthlySalary());
		
		System.out.println("Employee 1 salary after incerement of 10%");
		employee1.setMonthlySalary(12*(employee1.getMonthlySalary()+employee1.getMonthlySalary()*0.10));
		employee1.displayData();
		
		System.out.println("Employee 2 salary after incerement of 10%");
		employee2.setMonthlySalary(12*(employee2.getMonthlySalary()+employee2.getMonthlySalary()*0.10));
		employee2.displayData();
	}

}
