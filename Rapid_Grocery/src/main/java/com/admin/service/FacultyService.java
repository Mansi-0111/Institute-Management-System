package com.admin.service;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;



public interface FacultyService {

	public void addFaculty(UserMaster userMaster);
	
	public List<UserMaster> listFacultyRegistrations();
	
	public UserMaster getFacultyRegistration(int user_master_Id);
	
	public void deletFaculty(UserMaster userMaster);
		
	public List<UserType> listUserTypes();	
	
	public List<Course> listCourses();
}
