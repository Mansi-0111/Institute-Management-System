package com.admin.service;

import java.util.List;

import com.admin.bean.LoggerInfo;
import com.admin.bean.LoginBean;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;

public interface StudentRegistrationService {
	/*public void addStudent(StudentRegistration studentRegistration);
	public List<StudentRegistration> listStudentRegistrations();
	public StudentRegistration getStudentRegistration(int user_master_Id) ;
	public void deletStudent(StudentRegistration studentRegistration);*/
	
	public void addStudent(UserMaster userMaster) ;
	public List<UserMaster> listStudentRegistrations() ;
	public UserMaster getStudentRegistration(int user_master_Id) ;
	public void deletStudent(UserMaster userMaster);
	public List<UserType> listUserTypes();
	public List<Course> listCourses();
	
	
}
