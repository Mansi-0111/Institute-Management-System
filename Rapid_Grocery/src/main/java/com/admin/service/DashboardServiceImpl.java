package com.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.DashboardDao;

@Service("dashboardService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class DashboardServiceImpl implements DashboardService {

	@Autowired
   	DashboardDao dashboardDao;
	
	@Override
	@Transactional
	public int userCount() {
		// TODO Auto-generated method stub
		return dashboardDao.userCount();
	}

	@Override
	public int studentCount() {
		// TODO Auto-generated method stub
		return dashboardDao.studentCount();
	}

	@Override
	public int staffCount() {
		// TODO Auto-generated method stub
		return dashboardDao.staffCount();
	}
	
	@Override
	public int facultyCount() {
		// TODO Auto-generated method stub
		return dashboardDao.facultyCount();
	}
	
	@Override
	public int feedbackCount() {
		// TODO Auto-generated method stub
		return dashboardDao.feedbackCount();
	}
	
	@Override
	public int inquiryCount() {
		// TODO Auto-generated method stub
		return dashboardDao.inquiryCount();
	}

}
