package com.student.service.studentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.service.studentservice.model.StudentAddress;

public interface StudentAddressRepo extends JpaRepository<StudentAddress, Integer>{

}
