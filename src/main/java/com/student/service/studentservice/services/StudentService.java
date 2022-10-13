package com.student.service.studentservice.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.service.studentservice.model.Student;
import com.student.service.studentservice.repo.StudentRepo;


@Service
public class StudentService {
	
	@Autowired
	public StudentRepo studentRepo;
	
	public List<Student> getStudents(){
		return studentRepo.findAll();
	}
	
	public  Student postStudents(Student student){
		 return studentRepo.save(student);
	}

}
