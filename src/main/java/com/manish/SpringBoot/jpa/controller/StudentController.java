package com.manish.SpringBoot.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manish.SpringBoot.jpa.repo.StudentRepo;
import com.manish.SpringBoot.jpa.studentBeen.StudentBeen;

@RestController // combo 2 anotation.....resp. cont..
public class StudentController {
	@Autowired
	private StudentRepo repo;

	@PostMapping("/add")
	public StudentBeen add(@RequestBody StudentBeen sb) {

		return repo.save(sb);

	}

}
