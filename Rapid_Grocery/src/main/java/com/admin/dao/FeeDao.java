package com.admin.dao;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.Fee;
import com.admin.model.UserMaster;

public interface FeeDao {

	public void addFee(Fee fee);
	
	public List<Fee> listFees();
	
	public Fee getFee(int fee_id) ;
	
	public List<Course> listCourses();
	
	public List<UserMaster> listUserMasters();
	
}
