package com.web.bean;

public class OnlineExamSchedule {

	int examScheduleId, courseId;
	String courseName, examDate;
	public int getExamScheduleId() {
		return examScheduleId;
	}
	public void setExamScheduleId(int examScheduleId) {
		this.examScheduleId = examScheduleId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	
	
}
