package com.admin.service;

import java.util.List;

import com.admin.model.Assignment;
import com.admin.model.UserMaster;

public interface AssignmentService {

	public void addAssignment(Assignment assignment);
	
	public List<Assignment> listAssignments ();
	
	public Assignment getAssignment(int assignment_id);
	
	public List<UserMaster> listUserMasters();
}
