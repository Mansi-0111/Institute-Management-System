package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.AssignmentDao;
import com.admin.dao.AssignmentuploadDao;
import com.admin.model.Assignment;
import com.admin.model.Assignment_upload;
import com.admin.model.Course;
import com.admin.model.UserMaster;



@Service("assignmentuploadService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class AssignmentuploadServiceImpl implements AssignmentuploadService {
	
	@Autowired
	private AssignmentuploadDao assignmentuploadDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addAssignment(Assignment_upload assignment) {
		assignmentuploadDao.addAssignment(assignment);
	}
	
	//public List<Assignment> listAssignments (){
		//return assignmentuploadDao.listAssignments();
	//}

	public Assignment getAssignment(int assignment_id) {
		return assignmentuploadDao.getAssignment(assignment_id);
	}
	
	@Override
	public List<UserMaster> listUserMasters(){
		return assignmentuploadDao.listUserMasters();
	}
	
	@Override
	public List<Course> listCourses(){
		return assignmentuploadDao.listCourses();
	}


}
