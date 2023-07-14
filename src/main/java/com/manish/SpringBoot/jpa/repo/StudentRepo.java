package com.manish.SpringBoot.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.SpringBoot.jpa.studentBeen.StudentBeen;

public interface StudentRepo extends JpaRepository<StudentBeen, Long> {

}
