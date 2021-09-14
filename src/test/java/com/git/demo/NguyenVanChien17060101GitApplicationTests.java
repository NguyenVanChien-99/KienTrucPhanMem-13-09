package com.git.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.git.demo.entity.Student;
import com.git.demo.repo.StudentRepo;

@SpringBootTest
class NguyenVanChien17060101GitApplicationTests {

	@Autowired
	private StudentRepo repo;
	@Test
	void saveStudent() {
		Student s = new Student();
		s.setName("Hello");
		Student saved = repo.save(s);
		Assert.isNull(saved, "fail");
	}

}
