package com.student.service.studentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.service.studentservice.model.StudentInformation;

public interface StudentInformationRepo extends JpaRepository<StudentInformation, Integer>{

}
