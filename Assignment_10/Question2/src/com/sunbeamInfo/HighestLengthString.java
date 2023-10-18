package com.sunbeamInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		int diff=s1.length()-s2.length();
		return diff;
	}
	
}


public class HighestLengthString {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		Collections.addAll(list,"Adnan","Naveen","Jhon","BCDBEF","AAACDCDC","KBJajabkjabc KBDKJBAJBC KJ ajKBAJKSB C KJBAS KJA jk IDb");
		String s=Collections.max(list,new StringComparator());
		System.out.println("Length of "+s+" is "+s.length());
	}

}
