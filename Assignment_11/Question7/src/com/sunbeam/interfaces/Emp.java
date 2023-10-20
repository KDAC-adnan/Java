package com.sunbeam.interfaces;

@FunctionalInterface
public interface Emp {
	double getSal();
	default double calcIncentives()
	{
		return 0.0;
	}
	
	static double calcTotalIncome(Emp arr[]) {
		double totalSal=0;
		for(Emp ele:arr)
			totalSal+=ele.calcIncentives()+ele.getSal();
			
		return totalSal;
	}
}
