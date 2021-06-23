package com.te.compare.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(30,"Gauri", 22, 66.9,10));
		list.add(new Student(10,"Vinay",23, 68.9,11));
		list.add(new Student(50,"Sandeep",22, 70.0,12));
		list.add(new Student(20,"YashRaj",24, 61.9,8));
		list.add(new Student(90,"Veenal",21, 65.9,9));
		
		Scanner sc = new Scanner(System.in);
		int a;
		char ch;
		do
		{
		
		System.out.println(
				"1.To sort by id Press 1\n2.To sort by name Press 2\n3. To sort by age Press 3\n4.To sort by marks Press 4\n5.To sort by standard Press 5");
		System.out.println("Enter your choice:");
		a=sc.nextInt();
		switch (a) {
		case 1:
			new StudentID().id(list);

			break;
		case 2: new StudentName().name(list);
			break;
		case 3:new StudentAge().age(list);
			break;
		case 4:new StudentMarks().marks(list);	
			break;
		case 5:new StudentStandard().standard(list);
			break;
		}
		System.out.println();
		System.out.println("Do you want to continue?\n(Enter 'y' for yes or 'n' for no)");
		ch=sc.next().charAt(0);;
		System.out.println("=================Thank you for Sorting=============");
		}while (ch!='n');
		sc.close();
	}

}
