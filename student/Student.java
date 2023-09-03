package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Student Name from student class");
	}
	public void studentDept()
	{
		System.out.println("Student Department from student class");
	}
	public void studentId()
	{
		System.out.println("Student ID from student class");
	}
 public static void main(String[] args) {
	 Student s=new Student();
	 s.colegeName();
	 s.collegeCode();
	 s.collegeRank();
	 s.deptName();
	 s.studentName();
	 s.studentDept();
	 s.studentId();
	 
	
} 


}
