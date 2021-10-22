package com.info.beans;

public class KidDetails {

	private String name;

	private Integer age;

	private String school;

	private String parentNumber;
	
	

	public KidDetails(String name, Integer age, String school, String parentNumber) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
		this.parentNumber = parentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getParentNumber() {
		return parentNumber;
	}

	public void setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
	}

	@Override
	public String toString() {
		return "KidDetails [name=" + name + ", age=" + age + ", school=" + school + ", parentNumber=" + parentNumber
				+ "]";
	}

	
	
}
