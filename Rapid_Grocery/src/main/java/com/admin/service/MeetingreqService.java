package com.admin.service;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.Meeting_request;

public interface MeetingreqService {

	public void addMeetingreq(Meeting_request meeting_request);
	
	public List<Meeting_request> listMeeting_requests();
	
	public Meeting_request getMeeting_request(int meeting_req_id);
	
	public void deleteMeeting_request(Meeting_request meeting_request);
	
	public List<Course> listCourses();
}
