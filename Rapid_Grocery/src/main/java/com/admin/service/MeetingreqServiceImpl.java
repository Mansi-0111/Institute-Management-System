package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.ExamqaDao;
import com.admin.dao.MeetingreqDao;
import com.admin.model.Course;
import com.admin.model.Exam_QA;
import com.admin.model.Meeting_request;

@Service("meetingreqService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class MeetingreqServiceImpl implements MeetingreqService{

	@Autowired
	private MeetingreqDao meetingreqDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addMeetingreq(Meeting_request meeting_request) {
		meetingreqDao.addMeetingreq(meeting_request);
	}
	
	public List<Meeting_request> listMeeting_requests() {
		return meetingreqDao.listMeeting_requests();
	}

	public Meeting_request getMeeting_request(int meeting_req_id) {
		return meetingreqDao.getMeeting_request(meeting_req_id);
	}
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteMeeting_request(Meeting_request meeting_request) {
		meetingreqDao.deleteMeetingreq(meeting_request);
	}
	
	@Override
	public List<Course> listCourses(){
		return meetingreqDao.listCourses();
	}
}

