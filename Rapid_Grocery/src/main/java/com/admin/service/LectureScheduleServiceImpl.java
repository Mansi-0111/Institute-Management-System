package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.LectureScheduleDao;
import com.admin.model.Inquiry;
import com.admin.model.LectureSchedule;
import com.admin.model.OnlineExam;
import com.admin.model.UserMaster;

@Service("lecturescheduleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class LectureScheduleServiceImpl  implements LectureScheduleService{

	@Autowired
	private LectureScheduleDao lectureScheduleDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addlectureschedule(LectureSchedule lectureSchedule) {
		lectureScheduleDao.addlectureschedule(lectureSchedule);
	}
	
	public List<LectureSchedule> listLectureSchedules() {
		return lectureScheduleDao.listLectureSchedules();
	}
	
	
	/*
	 * public List<LectureSchedule> listLectureSchedules() { return
	 * lectureScheduleDao.listLectureSchedules(); }
	 * 
	 * public LectureSchedule getlLectureSchedule(int lectureschedule_id) { return
	 * lectureScheduleDao.getLectureSchedule(lectureschedule_id); }
	 * 
	 * @Transactional public void deleteLectureSchedule(LectureSchedule
	 * lectureSchedule) { lectureScheduleDao.deleteLectureSchedule(lectureSchedule);
	 * }
	 */
}
