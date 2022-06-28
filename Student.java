package org.student;

import org.college.College;

public class Student extends College   {

	public void studentName() {
		System.out.println("The Student Name is Gowthami");
	}
	
	public void studentDept() {
		System.out.println("My Department is Bsc.Computer Science");
	}
	
	public void studentId() {
		System.out.println("The StudentId is 1534");
	}

	
	public static void main(String[]args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
	}

}
	
	
	




