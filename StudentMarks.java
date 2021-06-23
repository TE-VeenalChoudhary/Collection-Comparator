package com.te.compare.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentMarks extends Student implements Comparator<Student>  {

	@Override
	public int compare(Student o1, Student o2) {
		return (int) ( o1.marks - o2.marks);
	}

	public void marks(ArrayList<Student> l) {
		System.out.println("===============Sorted by Student Marks================");
		Collections.sort(l, new StudentMarks());
		for (Student s1 : l) {
			System.out.println(s1);
		}
	}


}
