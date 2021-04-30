package com.niit.Hibernatejava;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Transient;
@Entity(name = "student_table")

public class Student {
	@Id
	int _id;
	@Transient
	String name;
	@Column(name = "trimester")
	int semester;
	int average;


	public Student(int id, String name, int semester, int average) {
		super();
		this._id = id;
		this.name = name;
		this.semester = semester;
		this.average = average;
	}
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		this._id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}


}
