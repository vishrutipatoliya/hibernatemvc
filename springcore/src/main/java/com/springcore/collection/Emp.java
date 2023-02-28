package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> course;
	private Properties props;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Emp(String name, List<String> phones, Set<String> address, Map<String, String> course,Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
