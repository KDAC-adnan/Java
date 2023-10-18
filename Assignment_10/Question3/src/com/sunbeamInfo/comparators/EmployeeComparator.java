package com.sunbeamInfo.comparators;

import java.util.Comparator;

import com.sunbeamInfo.Employee;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		
		return emp1.getEmpId()-emp2.getEmpId();
	}

}
