package com.sunbeaminfo;

import java.util.Scanner;

public class DailyDrivingCost {
	Scanner scanner = new Scanner(System.in);
	private int totalMilesDrivePerDay = 0;
	private int costPerGallonOfGasoline = 0;
	private int averageMilesPerGallon = 0;
	private int parkingFeesPerDay = 0;
	private int tollsPerDay = 0;

	public void inputData() {
		System.out.println("Enter total miles driven per day:");
		this.totalMilesDrivePerDay = scanner.nextInt();
		System.out.println("Enter cost per gallon of gasoline:");
		this.costPerGallonOfGasoline = scanner.nextInt();
		System.out.println("Enter average miles per gallon:");
		this.averageMilesPerGallon = scanner.nextInt();
		System.out.println("Enter parking fees per day:");
		this.parkingFeesPerDay = scanner.nextInt();
		System.out.println("Enter tolls per day");
		this.tollsPerDay = scanner.nextInt();
	}

	public void displayData() {
		System.out.println("Driving Cost Per Day:"+((this.totalMilesDrivePerDay / this.averageMilesPerGallon)*this.costPerGallonOfGasoline
				+ this.tollsPerDay + this.parkingFeesPerDay));
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getTotalMilesDrivePerDay() {
		return totalMilesDrivePerDay;
	}

	public void setTotalMilesDrivePerDay(int totalMilesDrivePerDay) {
		this.totalMilesDrivePerDay = totalMilesDrivePerDay;
	}

	public int getCostPerGallonOfGasoline() {
		return costPerGallonOfGasoline;
	}

	public void setCostPerGallonOfGasoline(int costPerGallonOfGasoline) {
		this.costPerGallonOfGasoline = costPerGallonOfGasoline;
	}

	public int getAverageMilesPerGallon() {
		return averageMilesPerGallon;
	}

	public void setAverageMilesPerGallon(int averageMilesPerGallon) {
		this.averageMilesPerGallon = averageMilesPerGallon;
	}

	public int getParkingFeesPerDay() {
		return parkingFeesPerDay;
	}

	public void setParkingFeesPerDay(int parkingFeesPerDay) {
		this.parkingFeesPerDay = parkingFeesPerDay;
	}

	public int getTollsPerDay() {
		return tollsPerDay;
	}

	public void setTollsPerDay(int tollsPerDay) {
		this.tollsPerDay = tollsPerDay;
	}
}
