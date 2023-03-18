package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Aadhitya");

	}

	public void studentDept() {
		System.out.println("Maths");

	}

	public void studentId() {

		System.out.println("1234");

	}

//as per Assignment request from TEst LEaf call all super calss and same class methods
	public static void main(String[] args) {
		Student cj = new Student();
		cj.collegeCode();
		cj.collegeName();
		cj.collegeRank();
		cj.collegeCode();
		cj.deptName();
		cj.studentDept();
		cj.studentId();
		cj.studentName();
	}

}
