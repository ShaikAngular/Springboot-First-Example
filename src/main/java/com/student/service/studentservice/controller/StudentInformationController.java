package com.student.service.studentservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.studentservice.model.StudentAddress;
import com.student.service.studentservice.model.StudentInformation;
import com.student.service.studentservice.repo.StudentInformationRepo;
import com.student.service.studentservice.services.StudentInformationService;


@RestController
@RequestMapping(path="/address")
public class StudentInformationController {
	
	@Autowired
	private StudentInformationService studentInformationService;
	
	@Autowired
	private StudentInformationRepo studentInformationRepo;
	
	@GetMapping(path="/studentInfo/{id}")
	public Optional<StudentInformation> getStudentList(@PathVariable int id) {
		return studentInformationService.getStudentById(id);
	}
	
	@PostMapping(path="/addStudentInfo")
	public StudentInformation addStudent(@RequestBody StudentInformation studentInformation){
		return  studentInformationService.postStudents(studentInformation);
	}
	
	@PostMapping(path="/{id}/addAddressById")
	public StudentAddress addStudentAddressById(@PathVariable int id, @RequestBody StudentAddress studentAddress) {
		
		Optional<StudentInformation> studentInfo = studentInformationRepo.findById(id);
		if(!studentInfo.isPresent()) {
			throw new RuntimeException("id" + id +"is not avaiable" );
		}
		return studentInformationService.postStudentAddressById(studentAddress);
		
	}


}
