package com.sunbeaminfo.datetest;
import com.sunbeaminfo.date.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date=new Date(1,1,2023);
		date.displayDate();
		date.setDay(25);
		date.displayDate();
		date.setMonth(12);
		date.displayDate();
		date.setYear(2024);
		System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());
	}

}
