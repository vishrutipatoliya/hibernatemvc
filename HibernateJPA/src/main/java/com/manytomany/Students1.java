package com.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Students1 {
	@Id
	
	private int id;
	private String name;
	private String branch;
	@ManyToMany
	private List<Subject1> subject;
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
	
	
	
	
	public List<Subject1> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject1> subject) {
		this.subject = subject;
	}
	
	
	public Students1(int id, String name, String branch, List<Subject1> subject) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.subject = subject;
	}
	public Students1() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
