package com.student.service.studentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.service.studentservice.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
