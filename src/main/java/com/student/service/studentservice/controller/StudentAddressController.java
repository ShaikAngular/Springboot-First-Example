package com.student.service.studentservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.studentservice.model.StudentAddress;
import com.student.service.studentservice.services.StudentAddressService;

@RestController
@RequestMapping(path="/studentInfo")

public class StudentAddressController {
	
	@Autowired
	private StudentAddressService studentAddressService;
	
	@GetMapping(path="/address")
	public List<StudentAddress> getAllAddress() {
		return studentAddressService.getAllAddress();
	}
	
	@GetMapping(path="/address/{id}")
	public Optional<StudentAddress> getStudentInfoByAddressId(@PathVariable int id) {
		return studentAddressService.getStudentInfoByAddressId(id);
	}

}
