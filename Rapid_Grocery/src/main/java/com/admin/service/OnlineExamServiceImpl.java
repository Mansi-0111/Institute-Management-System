package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.OnlineExamDao;
import com.admin.model.Course;
import com.admin.model.OnlineExam;
import com.admin.model.UserMaster;

@Service("onlineexamService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class OnlineExamServiceImpl implements  OnlineExamService{

	@Autowired
	private OnlineExamDao onlineExamDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addOnlineExam(OnlineExam onlineExam) {
		onlineExamDao.addOnlineExam(onlineExam);
	}
	
	public List<OnlineExam> listOnlineExams() {
		return onlineExamDao.listOnlineExams();
	}

	public OnlineExam getOnlineExam(int onlineexam_id) {
		return onlineExamDao.getOnlineExam(onlineexam_id);
	}
	
	@Override
	public List<Course> listCourses(){
		return onlineExamDao.listCourses();
	}
	
	@Override
	public List<UserMaster> listUserMasters(){
		return onlineExamDao.listUserMasters();
	}
	
	
}
