package com.info.builder;

import com.info.beans.KidDetails;

public class kidsBuilder {

	private String name;

	private Integer age;

	private String school;

	private String parentNumber;

	public kidsBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public kidsBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}

	public kidsBuilder setSchool(String school) {
		this.school = school;
		return this;
	}

	public kidsBuilder setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
		return this;
	}
	
	public KidDetails getKids() {
		return new KidDetails(name, age, school, parentNumber);
	}

}
