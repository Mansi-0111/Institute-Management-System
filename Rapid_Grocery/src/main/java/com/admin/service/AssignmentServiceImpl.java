package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.AssignmentDao;
import com.admin.model.Assignment;
import com.admin.model.UserMaster;



@Service("assignmentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class AssignmentServiceImpl implements AssignmentService {
	
	@Autowired
	private AssignmentDao assignmentDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addAssignment(Assignment assignment) {
		assignmentDao.addAssignment(assignment);
	}
	
	public List<Assignment> listAssignments (){
		return assignmentDao.listAssignments();
	}

	public Assignment getAssignment(int assignment_id) {
		return assignmentDao.getAssignment(assignment_id);
	}
	
	@Override
	public List<UserMaster> listUserMasters(){
		return assignmentDao.listUserMasters();
	}


}
