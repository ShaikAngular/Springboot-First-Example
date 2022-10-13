package com.student.service.studentservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.service.studentservice.model.StudentAddress;
import com.student.service.studentservice.repo.StudentAddressRepo;

@Service
public class StudentAddressService {
	
	@Autowired
	public StudentAddressRepo studentAddressRepo;
	
	public List<StudentAddress> getStudents(){
		return studentAddressRepo.findAll();
	}
	
	public  StudentAddress postStudents(StudentAddress studentAddress){
		 return studentAddressRepo.save(studentAddress);
	}

}
