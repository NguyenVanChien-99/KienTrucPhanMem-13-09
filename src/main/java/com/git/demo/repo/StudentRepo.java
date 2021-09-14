package com.git.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.git.demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{
	
}