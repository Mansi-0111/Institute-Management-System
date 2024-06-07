package com.admin.service;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.Fee;
import com.admin.model.UserMaster;

public interface FeeService {
	
	
	public void addFee(Fee fee) ;

	public List<Fee> listFees();
	
	public Fee getFee(int fee_id);
	
	public List<Course> listCourses();
	
	public List<UserMaster> listUserMasters();
}
