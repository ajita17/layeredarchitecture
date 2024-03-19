package com.studentmng.service;

import java.util.List;

import com.studentmng.model.Student;

public interface StudentService {
	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void addStudent(Student student);

	public void deleteStudent(int rollNo);

}
