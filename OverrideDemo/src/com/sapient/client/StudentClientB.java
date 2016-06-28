package com.sapient.client;

import com.sapient.beans.Student;

public class StudentClientB {

	public static void main(String[] args) {
		
		Student stu1 = new Student(1001,"ram",89);
		Student stu2 = new Student(1001,"ram",90);
		stu1 = null;
		stu2 = null;
		System.gc(); // does not kill object but request JVM
		System.out.println("line 3");
		System.out.println("line 4");

	}

}
