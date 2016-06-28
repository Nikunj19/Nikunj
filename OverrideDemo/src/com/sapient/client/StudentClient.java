package com.sapient.client;

import com.sapient.beans.Student;

public class StudentClient {

	public static void main(String[] args) {

		Student stu1 = new Student(1001, "ram", 89);
		Student stu2 = new Student(1001, "ram", 90);
		System.out.println(stu1); // it is calling object.toString method
		System.out.println(stu2);
		System.out.println(stu1.equals(stu2));

	}

}
