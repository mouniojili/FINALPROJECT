package com.info.beans;

public class CourseDetails {
	
	private String courseName;
	
	private String courseDuration;
	
	private Integer coursefees;
	
	

	public CourseDetails(String courseName, String courseDuration, Integer coursefees) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.coursefees = coursefees;
	}

	//Getters and Setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public Integer getCoursefees() {
		return coursefees;
	}

	public void setCoursefees(Integer coursefees) {
		this.coursefees = coursefees;
	}

	@Override
	public String toString() {
		return "CourseDetails [courseName=" + courseName + ", courseDuration=" + courseDuration + ", coursefees="
				+ coursefees + "]";
	}
	
	
	

}
