package com.info.service;

import com.info.beans.Kids;

public class CourseFactory {
	
	
	public LearningPortal getInstance(String type) {
		//Populate the objects required 
		if(type.equalsIgnoreCase("Kids")) {
			return new Kids();
		}
		return null;
	}

}
