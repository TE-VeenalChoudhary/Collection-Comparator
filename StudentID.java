package com.te.compare.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentID extends Student implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id-o2.id;
	}

	public void id(ArrayList<Student> l) {
		System.out.println("===============Sorted by Student id================");
		Collections.sort(l, new StudentID());
		for (Student s1 : l) {
			System.out.println(s1);
		}
	}


}
