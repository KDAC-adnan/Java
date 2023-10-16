package com.sunbeam.generic;
import com.sunbeam.*;


class Box<T extends Person>
{
	private T obj;
	public void setBox(T obj)
	{
		this.obj=obj;
	}
	
	public T getObj()
	{
		return this.obj;
	}
	public double getTotalSalary()
	{
		return obj.calCulateSalary();
	}
}

public class Test {
	
	
	public static void main(String[] args) {
	
	Box<Person> b1;
	b1=new Box<>();
	b1.setBox(new Salesman("Jhon",22,121,1200,150));
	System.out.println(b1.getObj());
	System.out.println(b1.getTotalSalary());
	
	b1.setBox(new Employee("adnan",23,121,1200));
	System.out.println(b1.getObj());
	System.out.println(b1.getTotalSalary());
	}

}
