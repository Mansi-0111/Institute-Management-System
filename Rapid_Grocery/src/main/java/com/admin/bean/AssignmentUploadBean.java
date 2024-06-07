package com.admin.bean;



public class AssignmentUploadBean {

	Integer assignment_Id,user_master_Id,course_Id;
	String assignment_Email,assignment_Submissiondate;
	String assignment_Que;
	
	
	public Integer getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}
	public Integer getUser_master_Id() {
		return user_master_Id;
	}
	public void setUser_master_Id(Integer user_master_Id) {
		this.user_master_Id = user_master_Id;
	}
	public Integer getAssignment_Id() {
		return assignment_Id;
	}
	public void setAssignment_Id(Integer assignment_Id) {
		this.assignment_Id = assignment_Id;
	}
	public String getAssignment_Email() {
		return assignment_Email;
	}
	public void setAssignment_Email(String assignment_Email) {
		this.assignment_Email = assignment_Email;
	}
	public String getAssignment_Submissiondate() {
		return assignment_Submissiondate;
	}
	public void setAssignment_Submissiondate(String assignment_Submissiondate) {
		this.assignment_Submissiondate = assignment_Submissiondate;
	}
	public String getAssignment_Que() {
		return assignment_Que;
	}
	public void setAssignment_Que(String assignment_Que) {
		this.assignment_Que = assignment_Que;
	}
	
		
	
}
