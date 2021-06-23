package com.te.compare.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentAge extends Student implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age-o2.age;
	}

	public void age(ArrayList<Student> l) {
		System.out.println("===============Sorted by Student Age================");
		Collections.sort(l, new StudentAge());
		for (Student s1 : l) {
			System.out.println(s1);
		}
	}


}
