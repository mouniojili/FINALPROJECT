package com.info.client;

import java.util.List;

import com.info.beans.CourseDetails;
import com.info.beans.ExamDetails;
import com.info.beans.KidDetails;
import com.info.builder.kidsBuilder;
import com.info.observer.ExamAlert;
import com.info.service.CourseFactory;
import com.info.service.LearningPortal;

public class KidsPortal {

	
	public static void main(String[] args) {
		
		//Builder pattern to set inputs of kids 
		KidDetails kid = new kidsBuilder().setName("Rakesh").setAge(8).setSchool("Omega global school").setParentNumber("7299877711").getKids();
		
		
		//Factory pattern to create objects 
		CourseFactory courseFactory = new CourseFactory();
		
		LearningPortal learningPortal =  courseFactory.getInstance("kids");
		learningPortal.registerKids(kid);
		System.out.println();
	    List<CourseDetails> courses = 	learningPortal.getCourseDetails(kid);
	    courses.stream().forEach(i->System.out.println(i));
		CourseDetails selectedCourse = learningPortal.selectCourse(courses);
		System.out.println();
		System.out.println("*********Selected Course*************");
		System.out.println(selectedCourse);
		System.out.println();
		ExamDetails exam = learningPortal.onlineExam(kid, selectedCourse);
		System.out.println(exam);
	
		//Observer pattern to send the exam alert 
		System.out.println();
		System.out.println("********Observer pattern to send the exam alert**********");
		ExamAlert alert = new ExamAlert();
		alert.sendExamNotification(kid);
		
		
	}
}
