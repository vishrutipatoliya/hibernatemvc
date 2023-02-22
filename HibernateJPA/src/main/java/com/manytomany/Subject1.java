package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Subject1 {
	@Id
	private int subCode;
	private String subjectName;
	@ManyToMany
	private List<Students1> student;
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
	public Subject1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Students1> getStudent() {
		return student;
	}
	public void setStudent(List<Students1> student) {
		this.student = student;
	}
	public Subject1(int subCode, String subjectName, List<Students1> student) {
		super();
		this.subCode = subCode;
		this.subjectName = subjectName;
		this.student = student;
	}

	
	
	

}
