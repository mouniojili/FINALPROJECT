package com.info.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.info.service.LearningPortal;

public class Kids implements LearningPortal{

	@Override
	public void registerKids(KidDetails kidDetails) {
		// TODO Auto-generated method stub
		System.out.println("**********Hello "+kidDetails.getName()+", you have been registered successfully for learning portal*********");
	}

	@Override
	public List<CourseDetails> getCourseDetails(KidDetails kidDetails) {
		// TODO Auto-generated method stub
		List<CourseDetails> courseList =null;
		if(kidDetails.getAge()>3 && kidDetails.getAge()<=7) {
			CourseDetails c1 = new CourseDetails("Drawing", "2 months", 6500);
			CourseDetails c2 = new CourseDetails("Smart toys", "2 months", 6500);
			CourseDetails c3= new CourseDetails("Communication", "2 months", 6500);
			courseList= Arrays.asList(c1,c2,c3);
			
		}
		else if(kidDetails.getAge()>7 && kidDetails.getAge()<11) {
			CourseDetails c1 = new CourseDetails("General knowlege", "6 months", 12500);
			CourseDetails c2 = new CourseDetails("Logical thinkings", "6 months", 15000);
			CourseDetails c3= new CourseDetails("Advanced Communication", "4 months", 10500);
			courseList= Arrays.asList(c1,c2,c3);
		}
		System.out.println("*******Show the available courses for the kids with their Age**********");
		return courseList;
	}

	
	@Override
	public ExamDetails onlineExam(KidDetails kidDetails, CourseDetails details) {
		// TODO Auto-generated method stub
		ExamDetails exam = new ExamDetails();
		exam.setKidName(kidDetails.getName());
		exam.setExamName(details.getCourseName());
		exam.setDateOfExam("20-12-2021");
		return exam;
	}

	@Override
	public CourseDetails selectCourse(List<CourseDetails> availableCourses) {
		// TODO Auto-generated method stub
		List<CourseDetails> orderedCourseList= new ArrayList<>();
		availableCourses.sort(Comparator.comparing(CourseDetails::getCoursefees));
		for (CourseDetails courses: availableCourses) {
			orderedCourseList.add(courses);
		}
		return orderedCourseList.get(0);
	}

	



}
