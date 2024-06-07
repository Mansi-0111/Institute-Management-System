package com.admin.service;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.OnlineExam;
import com.admin.model.UserMaster;

public interface OnlineExamService {

	public void addOnlineExam(OnlineExam onlineExam);
	
	public List<OnlineExam> listOnlineExams();
	
	public OnlineExam getOnlineExam(int onlineexam_id);
	
public List<Course> listCourses();
	
	public List<UserMaster> listUserMasters();
}
