package com.te.compare.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentName extends Student implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

	public void name(ArrayList<Student> l) {
		System.out.println("===============Sorted by Student Name================");
		Collections.sort(l, new StudentName());
		for (Student s1 : l) {
			System.out.println(s1);
		}
	}


}
