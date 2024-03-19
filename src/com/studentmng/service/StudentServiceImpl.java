package com.studentmng.service;

import java.util.ArrayList;
import java.util.List;

import com.studentmng.dao.StudentDao;
import com.studentmng.dao.StudentDaoImpl;
import com.studentmng.model.Student;

public class StudentServiceImpl implements StudentService {
      StudentDao dao;

      public StudentServiceImpl(){
    	  dao=new StudentDaoImpl();
      }

	   //retrive list of students from the database
	   @Override
	   public List<Student> getAllStudents() {
	      return dao.getAllStudents();
	   }

	   @Override
	   public Student getStudent(int rollNo) {
	      return dao.getStudent(rollNo);
	   }

	   @Override
	   public void updateStudent(Student student) {
		   dao.updateStudent(student);
	      System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
	   }



	@Override
	public void addStudent(Student student) {
		dao.addStudent(student);
		
	}
	@Override
	public   void deleteStudent(int rollNo) {
		   dao.deleteStudent(rollNo);
	   }

}
