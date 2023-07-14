package com.manish.SpringBoot.jpa.studentBeen;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentBeen {
	@Id
	int id;
	long roll;
	String name;
	String surname;

	@Override
	public String toString() {
		return "StudentBeen [id=" + id + ", roll=" + roll + ", name=" + name + ", surname=" + surname + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public StudentBeen(int id, long roll, String name, String surname) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.surname = surname;
	}

	public StudentBeen() {
		super();
		// TODO Auto-generated constructor stub
	}

}
