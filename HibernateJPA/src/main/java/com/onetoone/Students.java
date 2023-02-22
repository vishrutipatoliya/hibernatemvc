package com.onetoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Students {
	@Id
	
	private int id;
	private String name;
	private String branch;
	@OneToMany(mappedBy ="student")
	private List<Subject> subject;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	
	public Students(int id, String name, String branch, List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.subject = subject;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
