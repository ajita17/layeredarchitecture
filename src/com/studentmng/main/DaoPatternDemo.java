package com.studentmng.main;

import java.util.ArrayList;
import java.util.List;

import com.studentmng.dao.StudentDao;
import com.studentmng.dao.StudentDaoImpl;
import com.studentmng.model.Address;
import com.studentmng.model.StudenAddressDTO;
import com.studentmng.model.Student;
import com.studentmng.service.StudentService;
import com.studentmng.service.StudentServiceImpl;
//presentation layer
public class DaoPatternDemo {
	public static void main(String[] args) {
		 StudentService studentService = new StudentServiceImpl();

		 	//write logic and based on user choice perform operation
		    /*
		     * 1.get student
		     * 2.Update student
		     * 3.Delete student
		     * */
		    //print all students
		 List<Student> list=studentService.getAllStudents();
		    for (Student std : list) {
		       System.out.println("Student: [RollNo : " + std.getRollNo() + ", Name : " + std.getName() + " ]");
		    }


		    //update student
		    Student student =studentService.getAllStudents().get(0);
		    System.out.println(student);
		    student.setName("Michael");
		    studentService.updateStudent(student);

		    //get the student
		   // studentService.getStudent(0);
		   // System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
		
	
		    Student s1=new Student("priya",3);
		    studentService.addStudent(s1);
		    System.out.println("After calling add");
		    for (Student std : studentService.getAllStudents()) {
			       System.out.println("Student: [RollNo : " + std.getRollNo() + ", Name : " + std.getName() + " ]");
			   }

		    	
		    int rollNo=1;
		    studentService.deleteStudent(rollNo);
		    System.out.println("After delete");
		    List<Student> studList=studentService.getAllStudents();
		    for (Student std : studList) {
			       System.out.println("Student: [RollNo : " + std.getRollNo() + ", Name : " + std.getName() + " ]");
			   }
		    //comes from Dao by connecting with database 
		    Address adr1=new Address("mumbai",123);
		    Address adr2=new Address("mumbai",123);
		    
		    List<Address> adrList=new ArrayList<Address>();
		    adrList.add(adr1);
		    adrList.add(adr2);
		    
		    
		    List<StudenAddressDTO> sdto=new ArrayList<StudenAddressDTO>();
		    
		    sdto.add(new StudenAddressDTO(studList.get(0).getName(),adrList.get(0).getCity()));
		    sdto.add(new StudenAddressDTO(studList.get(1).getName(),adrList.get(1).getCity()));
		    
		   for(StudenAddressDTO dtodata:sdto) {
			   System.out.println(dtodata.getName() + " "+dtodata.getCity());
		   }
		    
	}
	}

