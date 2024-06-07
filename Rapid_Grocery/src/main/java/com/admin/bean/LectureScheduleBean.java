package com.admin.bean;

public class LectureScheduleBean {

	String subject;
	String scheduleDate;
	String startTime;
	String toTime;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
	@Override
	public String toString() {
		return "LectureScheduleBean [subject=" + subject + ", scheduleDate=" + scheduleDate + ", startTime=" + startTime
				+ ", toTime=" + toTime + "]";
	}
	
	

}
