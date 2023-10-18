package com.sunbeamInfo.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.sunbeamInfo.Employee;
import com.sunbeamInfo.comparators.EmployeeComparator;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Employee> empList = new LinkedList<>();
		Employee employee;
		int choice;

		empList.add(new Employee(5, "Adnan", 15000));
		empList.add(new Employee(4, "Naveen", 45000));
		empList.add(new Employee(3, "Jhon", 30000));
		empList.add(new Employee(1, "Prashant", 40000));
		empList.add(new Employee(2, "Seth", 60000));
		try {
			do {
				System.out.println("--------------------");
				System.out.println("0. EXIT");
				System.out.println("1. Add employee");
				System.out.println("2. Delete employee");
				System.out.println("3. Find employee");
				System.out.println("4. Sort all employee");
				System.out.println("5. Update employee");
				System.out.println("6. Display all employee");
				System.out.println("Enter above choice!!");
				choice = scanner.nextInt();
				System.out.println("--------------------");
				switch (choice) {
				case 0:
					System.exit(0);
					break;
				case 1:
					employee = new Employee();
					employee.accept(scanner);
					empList.add(employee);
					break;
				case 2: {
					int id;
					System.out.print("Enter employee id to delete:");
					id = scanner.nextInt();
					employee = new Employee(id);
					if (empList.remove(employee)) {
						System.out.println("Deletion done!!");
					} else
						System.out.println("No employee exists with id:" + id);
				}
					break;
				case 3: {
					int id;
					System.out.print("Enter employee id to delete:");
					id = scanner.nextInt();
					employee = new Employee(id);
					if (empList.contains(employee))
						System.out.println(empList.get(empList.indexOf(employee)));
				}
					break;
				case 4:
					Collections.sort(empList, new EmployeeComparator());
					for (int i = 0; i < empList.size(); i++)
						System.out.println(empList.get(i));
					break;
				case 5:
					System.out.println("Enter emp id to be modified: ");
					int id = scanner.nextInt();
					employee = new Employee();
					employee.setEmpId(id);
					int index = empList.indexOf(employee);
					if (index == -1)
						System.out.println("Employee not found.");
					else {
						System.out.println("Employee Found: " + empList.get(index));
						System.out.println("Enter new information for the Employee");
						employee = new Employee();
						employee.accept(scanner);
						empList.set(index, employee);
					}
					break;
				case 6:
					for(int i=0;i<empList.size();i++)
						System.out.println(empList.get(i));
					break;
				default:
					break;
				}
			} while (choice != 0);
		} finally {
			System.out.println("Thank You! Application close");
			scanner.close();
		}
	}

}
