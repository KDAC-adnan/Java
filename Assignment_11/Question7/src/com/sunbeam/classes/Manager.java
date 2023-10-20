package com.sunbeam.classes;

import com.sunbeam.interfaces.Emp;

public class Manager implements Emp{

	private double basicSalary;
	private double dearanceAllowance;
	
	@Override
	public double getSal() {
		return this.basicSalary+this.dearanceAllowance;
	}
	
	@Override
	public double calcIncentives()
	{
		return 0.2*this.basicSalary;
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	
}
