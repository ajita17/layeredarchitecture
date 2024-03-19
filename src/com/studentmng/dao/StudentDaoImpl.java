package com.studentmng.dao;

import java.util.ArrayList;
import java.util.List;

import com.studentmng.model.Student;

public class StudentDaoImpl implements StudentDao {
	//list is working as a database
	   List<Student> students;

	   public StudentDaoImpl(){
		   //consider this arraylist data is fetched from database
	      students = new ArrayList<Student>();
	      Student student1 = new Student("Robert",0);
	      Student student2 = new Student("John",1);
	      students.add(student1);
	      students.add(student2);		
	   }
//	   @Override
//	   public void deleteStudent(Student student) {
//	      students.remove(student.getRollNo());
//	      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
//	   }

	   //retrive list of students from the database
	   @Override
	   public List<Student> getAllStudents() {
	      return students;
	   }

	   @Override
	   public Student getStudent(int rollNo) {
	      return students.get(rollNo);
	   }

	   @Override
	   public void updateStudent(Student student) {
		   System.out.println("student in Dao"+student);
	      students.get(student.getRollNo()).setName(student.getName());
	
	      System.out.println("Student: Roll No " + student.getRollNo() + ", updated with name"+ student.getName()+ "in the database");
	   }

	@Override
	public void addStudent(Student student) {
		
		students.add(student);
		
	}
	@Override
	public void deleteStudent(int rollNo) {
		students.remove(rollNo);
		
	}
}
