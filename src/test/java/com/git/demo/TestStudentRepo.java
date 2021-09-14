package com.git.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.git.demo.entity.Student;
import com.git.demo.repo.StudentRepo;

@SpringBootTest
class TestStudentRepo {

	@Autowired
	private StudentRepo repo;
	@Test
	void TestGet() {
		Student s = repo.getStudent_Id(1l);
		Assert.isNull(s,"get fail");
	}
}
