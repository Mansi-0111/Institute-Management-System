package com.admin.bean;

public class MeetingreqBean {
	private Integer meeting_Req_id;
	private String meeting_Link;
	private String meeting_Date_time;
	private String course_ID;
	private String topic;
	
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
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
