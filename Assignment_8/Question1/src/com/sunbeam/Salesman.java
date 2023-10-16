package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	
	private double bonus;

	public Salesman(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Salesman() {
		super();
	}

	public Salesman(String name,int age,int empid, double salary,double bonus) {
		super(name,age,empid, salary);
		this.bonus=bonus;
	}


	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	@Override
	public void acceptData()
	{
		super.acceptData();
		System.out.print("Enter bonus:");
		bonus=new Scanner(System.in).nextDouble();
	}
	
	@Override
	public String toString() {
		return super.toString()+"Salesman [bonus=" + bonus + "]";
	}
	
	@Override
	public double calCulateSalary()
	{
		return this.bonus+super.getSalary();
	}
}
