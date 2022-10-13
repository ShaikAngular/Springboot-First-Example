package com.student.service.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.studentservice.model.Student;
import com.student.service.studentservice.services.StudentService;

@RestController
//@RequestMapping(path="/demo")
public class MainController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping(path="/students")
	public List<Student> getStudentList() {
		return studentService.getStudents();
	}
	
	@PostMapping(path="/addStudent")
	public Student addStudent(@RequestBody Student student){
		return  studentService.postStudents(student);
	}

}
