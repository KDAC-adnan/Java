package com.sunbeam.tester;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.sunbeam.Student;

public class Tester {

	public static int menu(Scanner scanner) {
		int choice;
		System.out.println("-------------------");
		System.out.println("0.EXIT");
		System.out.println("1.Insert in map");
		System.out.println("2.Find in map");
		System.out.println("3.Display all Student");
		choice = scanner.nextInt();
		System.out.println("-------------------");
		return choice;
	}

	public static void acceptStudent(Student student,Scanner scanner)
	{
		int rollNo;
		String name;
		System.out.print("Enter Roll Number:");
		rollNo=scanner.nextInt();
		System.out.print("Enter Student Name:");
		scanner.nextLine();
		name=scanner.nextLine();
		student.setRollNo(rollNo);
		student.setName(name);
	}
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Map<Integer, Student> studentMap = new LinkedHashMap<>();
		Student student=new Student();
		int choice;
		
		try
		{
			while ((choice = menu(scanner)) != 0) {
				switch (choice) {
				case 1://Add student in map
					acceptStudent(student,scanner);
					studentMap.put(student.getRollNo(), student);
					break;
				case 2://Search for student
					System.out.println("Enter rollNo:");
					int roll=scanner.nextInt();
					if(studentMap.get(roll)!=null)
						System.out.println(studentMap.get(roll));
					else
						System.out.println("Student not found!!");
					break;
				case 3://Display all student from map
					Set<Entry<Integer,Student>> entry=studentMap.entrySet();
					for(Entry<Integer,Student> e:entry)
						System.out.println(e.getKey()+"->"+e.getValue());
					break;
				default:
					break;
				}
			}
		}
		finally
		{
			scanner.close();
		}
	}

}
