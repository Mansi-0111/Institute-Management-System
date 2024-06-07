package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.bean.LoggerInfo;
import com.admin.bean.LoginBean;
import com.admin.dao.StaffDao;
import com.admin.dao.StudentRegistrationDao;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;

@Service("studentregistrationService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class StudentRegistrationServiceImpl implements StudentRegistrationService{

	@Autowired
	private StudentRegistrationDao studentRegistrationDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addStudent(UserMaster userMaster) {
		studentRegistrationDao.addStudent(userMaster);
	}
	
	public List<UserMaster> listStudentRegistrations() {
		return studentRegistrationDao.listStudentRegistrations();
	}

	public UserMaster getStudentRegistration(int user_master_Id) {
		return studentRegistrationDao.getStudentRegistration(user_master_Id);
	}
	
	@Transactional
	public void deletStudent(UserMaster userMaster) {
		studentRegistrationDao.deletStudent(userMaster);
	}
	
	@Override
	public List<UserType> listUserTypes(){
		return studentRegistrationDao.listUserTypes();
	}
	
	@Override
	public List<Course> listCourses(){
		return studentRegistrationDao.listCourses();
	}
	
	
}
