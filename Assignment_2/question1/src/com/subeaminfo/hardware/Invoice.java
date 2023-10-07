package com.subeaminfo.hardware;

import java.util.Scanner;

public class Invoice {
	private String partNumber = "";
	private String description = "";

	public Invoice() {
	}

	private int quantity;
	private double price;

	Scanner scanner = new Scanner(System.in);

	public Invoice(String partNumber, String description, int quantity, double price) {
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity <= 0)
			this.quantity = 0;
		else
			this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 0)
			this.price = 0.0;
		else
			this.price = price;
	}

	public void acceptData() {
		System.out.print("Enter Part number=");
		this.partNumber = scanner.nextLine();
		System.out.print("Enter Part description=");
		this.description = scanner.nextLine();
		System.out.print("Enter quantity=");
		this.quantity = scanner.nextInt();
		if (this.quantity <= 0)
			this.quantity = 0;
		System.out.print("Enter price=");
		this.price = scanner.nextDouble();
		if (this.price <= 0)
			this.price = 0.0;
	}

	public void displayData() {
		System.out.println("Part Number:" + this.partNumber);
		System.out.println("Part Description:" + this.description);
		System.out.println("Part Quantity:" + this.quantity);
		System.out.println("Part Price:" + this.price);

	}

}
