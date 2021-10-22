package com.info.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.info.beans.CourseDetails;
import com.info.beans.KidDetails;
import com.info.beans.Kids;
import com.info.builder.kidsBuilder;

class TestLearningPortal {

	Kids obj = new Kids();
	
	@Test
	void testGetCourseDetails() {
		KidDetails kid = new kidsBuilder().setName("Rakesh").setAge(8).setSchool("Omega global school").setParentNumber("7299877711").getKids();
		  List<CourseDetails> courses = 	obj.getCourseDetails(kid);
		  assertNotNull(courses);
	}
	
	@Test
	void testCourseDetails() {
		KidDetails kid = new kidsBuilder().setName("Rakesh").setAge(0).setSchool("Omega global school").setParentNumber("7299877711").getKids();
		  List<CourseDetails> courses = 	obj.getCourseDetails(kid);
		  assertNull(courses);
	}
	
	@Test
	void testSelectCourse() {
		KidDetails kid = new kidsBuilder().setName("Rakesh").setAge(8).setSchool("Omega global school").setParentNumber("7299877711").getKids();
		List<CourseDetails> courses1 = 	obj.getCourseDetails(kid); 
		CourseDetails selectedCourse = obj.selectCourse(courses1);
		assertNotNull(selectedCourse);
	}
	
	@Test
	void testNoSelectCourse() {
		KidDetails kid = new kidsBuilder().setName("Rakesh").setAge(0).setSchool("Omega global school").setParentNumber("7299877711").getKids();
		List<CourseDetails> courses2 = 	obj.getCourseDetails(kid); 
		CourseDetails selectedCourse2 = obj.selectCourse(courses2);
		assertNull(selectedCourse2);
	}
	 
		

}
