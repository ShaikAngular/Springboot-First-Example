package com.student.service.studentservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.service.studentservice.model.StudentAddress;
import com.student.service.studentservice.model.StudentInformation;
import com.student.service.studentservice.repo.StudentAddressRepo;
import com.student.service.studentservice.repo.StudentInformationRepo;

@Service
public class StudentInformationService {
	

	@Autowired
	public StudentInformationRepo studentInformationRepo;
	
	@Autowired
	public StudentAddressRepo studentAddressRepo;
	
	public List<StudentInformation> getStudents(){
		return studentInformationRepo.findAll();
	}
	
	public Optional<StudentInformation> getStudentById(int id) {
		return studentInformationRepo.findById(id);
	}
	
	public  StudentInformation postStudents(StudentInformation studentInformation){
		 return studentInformationRepo.save(studentInformation);
	}
	
	public StudentAddress postStudentAddressById(StudentAddress sa) {
		return studentAddressRepo.save(sa);
	}


}
