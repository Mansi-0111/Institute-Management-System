package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="meeting_request")
public class Meeting_request {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "meeting_req_id")
	private Integer meeting_Req_id;
	
	@Column(name="meeting_link")
	private String meeting_Link;
	
	@Column(name="meeting_date_time")
	private String meeting_Date_time;
	
	@Column(name="course_id")
	private String course_ID;
	
	
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Column(name="topic")
	private String topic;

	public Integer getMeeting_Req_id() {
		return meeting_Req_id;
	}

	public void setMeeting_Req_id(Integer meeting_Req_id) {
		this.meeting_Req_id = meeting_Req_id;
	}

	public String getMeeting_Link() {
		return meeting_Link;
	}

	public void setMeeting_Link(String meeting_Link) {
		this.meeting_Link = meeting_Link;
	}

	public String getMeeting_Date_time() {
		return meeting_Date_time;
	}

	public void setMeeting_Date_time(String meeting_Date_time) {
		this.meeting_Date_time = meeting_Date_time;
	}

	public String getCourse_ID() {
		return course_ID;
	}

	public void setCourse_ID(String course_ID) {
		this.course_ID = course_ID;
	}
	
}
