package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.ExamScheduleDao;
import com.admin.model.Course;
import com.admin.model.ExamSchedule;
import com.admin.model.UserMaster;

@Service("examscheduleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class ExamScheduleServiceImpl implements ExamScheduleService {


	@Autowired
	private ExamScheduleDao examScheduleDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addExamSchedule(ExamSchedule examSchedule) {
		examScheduleDao.addExamSchedule(examSchedule);
	}
	
	public List<ExamSchedule> listExamSchedules() {
		return examScheduleDao.listExamSchedules();
	}

	public ExamSchedule getExamSchedule(int examschedule_id) {
		return examScheduleDao.getExamSchedule(examschedule_id);
	}
	
	public void deleteExamSchedule(ExamSchedule examSchedule) {
		examScheduleDao.deleteExamSchedule(examSchedule);
	}
	
	@Override
	public List<Course> listCourses(){
		return examScheduleDao.listCourses();
	}
	
	@Override
	public List<UserMaster> listUserMasters(){
		return examScheduleDao.listUserMasters();
	}

}
