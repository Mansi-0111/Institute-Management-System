package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.FacultyDao;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;




@Service("facultyService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class FacultyServiceImpl implements FacultyService{

	@Autowired
	private FacultyDao facultyDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addFaculty(UserMaster userMaster) {
		facultyDao.addFaculty(userMaster);
	}
	
	public List<UserMaster> listFacultyRegistrations() {
		return facultyDao.listFacultyRegistrations();
	}

	public UserMaster getFacultyRegistration(int user_master_Id) {
		return facultyDao.getFacultyRegistration(user_master_Id);
	}
	
	@Transactional
	public void deletFaculty(UserMaster userMaster) {
		facultyDao.deleteFaculty(userMaster);
	}
	
	@Override
	public List<UserType> listUserTypes(){
		return facultyDao.listUserTypes();
	}
	
	@Override
	public List<Course> listCourses(){
		return facultyDao.listCourses();
	}
	
	
}
