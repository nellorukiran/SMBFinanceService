package com.smb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smb.entity.Student;



public interface StudentRepo extends JpaRepository<Student, Long> {

}
