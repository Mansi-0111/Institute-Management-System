package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Course;
import com.admin.model.Exam_QA;
import com.admin.model.Meeting_request;

@Repository("meetingreqDao")
public class MeetingreqDaoImpl implements MeetingreqDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addMeetingreq(Meeting_request meeting_request) {
		sessionFactory.getCurrentSession().saveOrUpdate(meeting_request);
	}
	
	public List<Meeting_request> listMeeting_requests() {
		return (List<Meeting_request>) sessionFactory.getCurrentSession().createCriteria(Meeting_request.class).list();
	}

	public Meeting_request getMeeting_request(int meeting_req_id) {
		return (Meeting_request) sessionFactory.getCurrentSession().get(Meeting_request.class, meeting_req_id);
	}

	public void deleteMeetingreq(Meeting_request meeting_request) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Meeting_request WHERE meeting_req_id = "+meeting_request.getMeeting_Req_id()).executeUpdate();
	}
	@Override
	public List<Course> listCourses()
	{
		return(List<Course>) sessionFactory.getCurrentSession().createCriteria(Course.class).list();
	}
}
