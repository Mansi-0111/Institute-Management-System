package com.admin.dao;

import java.util.List;

import com.admin.model.Assignment;
import com.admin.model.UserMaster;


public interface AssignmentDao {
	
	public void addAssignment(Assignment assignment);
	
	public List<Assignment> listAssignments();
	
	public Assignment getAssignment(int assignment_id) ;
	
	public List<UserMaster> listUserMasters();
}
