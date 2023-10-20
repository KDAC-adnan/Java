package com.sunbeam.tester;

import com.sunbeam.classes.Clerk;
import com.sunbeam.classes.Labor;
import com.sunbeam.classes.Manager;
import com.sunbeam.interfaces.Emp;

public class Tester {

	public static void main(String[] args) {
		
		Emp[] empArr=new Emp[3];
		empArr[0]=new Manager(1200,150);
		empArr[1]=new Labor(650,1250);
		empArr[2]=new Clerk(2000);

		System.out.println("Total salaries of all Employees:"+Emp.calcTotalIncome(empArr));
	}

}
