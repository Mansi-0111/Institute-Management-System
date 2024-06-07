package com.admin.service;

import java.util.List;

import com.admin.bean.LoggerInfo;
import com.admin.bean.LoginBean;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;




public interface StaffService {
		public void addStaff(UserMaster userMaster);
		
		public List<UserMaster> listStaffRegistrations();
		
		public UserMaster getStaffRegistration(int user_master_Id);
		
		public void deletStaff(UserMaster userMaster);
		
		public List<UserType> listUserTypes();
		public List<Course> listCourses();
		
		public LoggerInfo getLoggerInfo(LoginBean loginBean);
}
