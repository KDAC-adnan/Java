package com.sunbeam.tester;

import java.util.Arrays;
import java.util.Comparator;

import com.sunbeam.Student;

public class TesterMain {

	public static void main(String[] args) {

		class StudentComparator implements Comparator<Student>
		{

			@Override
			public int compare(Student s1, Student s2) {
				int diff=-s1.getCity().compareTo(s2.getCity());
					if(diff==0)
						diff=(int)(s2.getMarks()-s1.getMarks());
					if(diff==0)
						diff=s1.getName().compareTo(s2.getName());
				return diff;
			}
			
		}
		
		StudentComparator studentComparator=new StudentComparator();
		Student[] studentArr=new Student[10];
		studentArr[0]=new Student(4,"Adnan","Sagar",25);
		studentArr[1]=new Student(9,"XYZ","Sagar",25);
		studentArr[2]=new Student(10,"Naveen","Delhi",30);
		studentArr[3]=new Student(1,"Jhon","Delhi",50);
		studentArr[4]=new Student(3,"King","Jhonpur",20);
		studentArr[5]=new Student(2,"Queen","Mirzapur",50);
		studentArr[6]=new Student(5,"Jack","London",50);
		studentArr[7]=new Student(7,"Lilly","Kolhapur",50);
		studentArr[8]=new Student(6,"Billu","Sagar",50);
		studentArr[9]=new Student(8,"Zain","Mumbai",50);
		
		
		
		System.out.println("Before sorting:");
		for(Student sElement:studentArr)
			System.out.println(sElement);
		
		Arrays.sort(studentArr,studentComparator);
		System.out.println("After sorting:");
		for(Student sElement:studentArr)
			System.out.println(sElement);
		
	}

}
