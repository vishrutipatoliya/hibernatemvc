package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subject {
	@Id
	private int subCode;
	private String subjectName;
	@ManyToOne
	private Students student;
	public int getSubCode() {
		return subCode;
	}
	public void setSubCode(int subCode) {
		this.subCode = subCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	public Subject(int subCode, String subjectName, Students student) {
		super();
		this.subCode = subCode;
		this.subjectName = subjectName;
		this.student = student;
	}
	
	
	

}
