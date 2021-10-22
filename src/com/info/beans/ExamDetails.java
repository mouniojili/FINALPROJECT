package com.info.beans;

public class ExamDetails {
	
	private String examName;
		
	private String kidName;
	
	private String dateOfExam;
	

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public String getDateOfExam() {
		return dateOfExam;
	}

	public void setDateOfExam(String dateOfExam) {
		this.dateOfExam = dateOfExam;
	}

	@Override
	public String toString() {
		return "ExamDetails [examName=" + examName + ", kidName=" + kidName + ", dateOfExam=" + dateOfExam + "]";
	}
	
	

}
