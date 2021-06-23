package com.te.compare.assignment1;

public class Student {
	
	int id;
	String name;
	int age;
	double marks;
	int standard;	
	
	public Student() {
		super();
	}

	public Student(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}

}
