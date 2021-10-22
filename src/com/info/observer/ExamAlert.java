package com.info.observer;

import com.info.beans.KidDetails;

public class ExamAlert {
	
   User users = new User();
	
	public void sendExamNotification(KidDetails user) {
		users.notifyUser(" Your Exam is scheduled on 21-10-2022 ", user.getName());
	}

}
