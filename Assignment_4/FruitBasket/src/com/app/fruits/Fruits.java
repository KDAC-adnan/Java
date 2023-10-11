package com.app.fruits;

import java.util.Objects;
import java.util.Scanner;

public class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;

	
	public Fruits(String name) {
		this.name = name;
		this.isFresh=true;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruit name=" + name + ", color=" + color + ", weight=" + weight+"kg";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Fruits))
			return false;
		Fruits other = (Fruits) obj;
		return Objects.equals(color, other.color) && isFresh == other.isFresh && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}

	public void accept() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Color:");
		this.color = scanner.nextLine();
		System.out.println("Enter weight:");
		this.weight = scanner.nextDouble();
//		scanner.close();
	}
	
	public String taste()
	{
		return "no specific taste";
	}
}
