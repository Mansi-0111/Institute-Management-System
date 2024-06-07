package com.admin.service;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.ExamSchedule;
import com.admin.model.UserMaster;

public interface ExamScheduleService {

	public void addExamSchedule(ExamSchedule examSchedule);
	
	public List<ExamSchedule> listExamSchedules();
	
	public ExamSchedule getExamSchedule(int examschedule_id);
	
	public void deleteExamSchedule(ExamSchedule examSchedule);
	
	public List<Course> listCourses();
	
	public List<UserMaster> listUserMasters();
}
