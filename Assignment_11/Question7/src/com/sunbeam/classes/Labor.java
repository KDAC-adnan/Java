package com.sunbeam.classes;

import com.sunbeam.interfaces.Emp;

public class Labor implements Emp {

	private double hours;
	private double rate;
	
	@Override
	public double getSal() {
		return this.hours * this.rate;
	}
	
	@Override
	public double calcIncentives()
	{
		if(this.rate>300)
			return 0.5*this.getSal();
		return 0.0;
	}

	public Labor(double hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}
}
