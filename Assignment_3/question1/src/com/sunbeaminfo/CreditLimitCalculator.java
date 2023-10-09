package com.sunbeaminfo;

import java.util.Scanner;

public class CreditLimitCalculator {
	private int accountNumber=0;
	private int balanceAtBegningOfMonth=0;
	private int totalOfAllItemsCharged=0;
	private int totalCreditsApplied=0;
	private int allowedCreditLimit=0;
	Scanner scanner=new Scanner(System.in);
	
	public void inputData()
	{
		System.out.print("Enter AccountNumber:");
		accountNumber=scanner.nextInt();
		System.out.print("Enter Balance at the beginning of month:");
		balanceAtBegningOfMonth=scanner.nextInt();
		System.out.print("Enter Total of all items charged:");
		totalOfAllItemsCharged=scanner.nextInt();
		System.out.print("Enter total credits applied:");
		totalCreditsApplied=scanner.nextInt();
		System.out.print("Enter total credits allowed:");
		allowedCreditLimit=scanner.nextInt();
	}
	
	public void displayCreditLimitExceeded()
	{
		int newBalance=this.balanceAtBegningOfMonth+this.totalOfAllItemsCharged-this.totalCreditsApplied;
		System.out.println("New Balance:"+newBalance);
		boolean flag=newBalance>this.allowedCreditLimit;
		if(flag)
			System.out.println("Credit Limit Exceeded");	
	}
}
