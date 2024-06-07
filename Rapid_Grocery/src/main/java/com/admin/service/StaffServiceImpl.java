package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.bean.LoggerInfo;
import com.admin.bean.LoginBean;
import com.admin.dao.StaffDao;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;



@Service("staffService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class StaffServiceImpl implements StaffService{
	@Autowired
	private StaffDao staffDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addStaff(UserMaster userMaster) {
		staffDao.addStaff(userMaster);
	}
	
	public List<UserMaster> listStaffRegistrations() {
		return staffDao.listStaffRegistrations();
	}

	public UserMaster getStaffRegistration(int user_master_Id) {
		return staffDao.getStaffRegistration(user_master_Id);
	}
	
	@Transactional
	public void deletStaff(UserMaster userMaster) {
		staffDao.deleteStaff(userMaster);
	}
	
	@Override
	public List<UserType> listUserTypes(){
		return staffDao.listUserTypes();
	}
	
	@Override
	public List<Course> listCourses(){
		return staffDao.listCourses();
	}
	
	@Override
	public LoggerInfo getLoggerInfo(LoginBean loginBean) {
		// TODO Auto-generated method stub
		return staffDao.getLoggerInfo(loginBean);
	}
}
