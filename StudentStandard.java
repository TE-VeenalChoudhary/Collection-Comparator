package com.te.compare.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentStandard extends Student implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.standard-o2.standard;
	}

	public void standard(ArrayList<Student> l) {
		System.out.println("===============Sorted by Student Standard================");
		Collections.sort(l, new StudentStandard());
		for (Student s1 : l) {
			System.out.println(s1);
		}
	}


}
