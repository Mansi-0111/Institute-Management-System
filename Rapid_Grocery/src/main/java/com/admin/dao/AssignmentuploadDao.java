package com.admin.dao;

import java.util.List;

import com.admin.model.Assignment;
import com.admin.model.Assignment_upload;
import com.admin.model.Course;
import com.admin.model.UserMaster;


public interface AssignmentuploadDao {
	
	public void addAssignment(Assignment_upload assignment);
	
	//public List<Assignment> listAssignments();
	
	public Assignment getAssignment(int assignment_id) ;
	
	public List<UserMaster> listUserMasters();
	public List<Course> listCourses();
}
