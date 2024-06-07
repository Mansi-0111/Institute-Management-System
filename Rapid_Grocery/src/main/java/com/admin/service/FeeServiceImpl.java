package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.FeeDao;
import com.admin.model.Course;
import com.admin.model.Fee;
import com.admin.model.UserMaster;

@Service("feeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class FeeServiceImpl implements FeeService {

	@Autowired
	private FeeDao feeDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addFee(Fee fee) {
		feeDao.addFee(fee);
	}
	
	public List<Fee> listFees() {
		return feeDao.listFees();
	}

	public Fee getFee(int fee_id) {
		return feeDao.getFee(fee_id);
	}
	
	@Override
	public List<Course> listCourses(){
		return feeDao.listCourses();
	}
	
	@Override
	public List<UserMaster> listUserMasters(){
		return feeDao.listUserMasters();
	}


}
