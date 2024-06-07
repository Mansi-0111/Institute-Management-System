package com.admin.dao;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;

public interface FacultyDao {
	
	public void addFaculty(UserMaster userMaster);

	public List<UserMaster> listFacultyRegistrations();

	public UserMaster getFacultyRegistration(int user_master_Id) ;
	
	public void deleteFaculty(UserMaster userMaster);
	
	public List<UserType> listUserTypes();
	
	public List<Course> listCourses();
	
}

