package com.info.service;

import java.util.List;

import com.info.beans.CourseDetails;
import com.info.beans.ExamDetails;
import com.info.beans.KidDetails;

public interface LearningPortal {
	
	void registerKids(KidDetails kidDetails);
	
	List<CourseDetails> getCourseDetails(KidDetails kidDetails);
	
	CourseDetails selectCourse(List<CourseDetails>  availableCourses);
	
	ExamDetails onlineExam(KidDetails kidDetails,CourseDetails details);
	
 

}
