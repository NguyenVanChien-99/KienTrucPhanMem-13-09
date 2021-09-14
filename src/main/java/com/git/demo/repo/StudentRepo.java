package com.git.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.git.demo.entity.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long>{

}
