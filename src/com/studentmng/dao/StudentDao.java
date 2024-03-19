package com.studentmng.dao;
import java.util.List;

import com.studentmng.model.Student;

public interface StudentDao {
	   public List<Student> getAllStudents();
	
	   public Student getStudent(int rollNo);
	   
	   public void updateStudent(Student student);
	   
	   void addStudent(Student student);
	   
	   public void deleteStudent(int rollNo);
}
