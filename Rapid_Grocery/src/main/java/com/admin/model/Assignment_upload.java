package com.admin.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="assignment_upload")
public class Assignment_upload {

	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "assignment_id")
	private Integer assignment_Id;
	
	@Column(name = "user_master_id")
	private Integer user_master_Id;
	
	@Column(name = "course_id")
	private Integer course_Id;
	
	@Column(name="assignment_email")
	private String assignment_Email;
	
	@Column(name="assignment_submissiondate")
	private String assignment_Submissiondate;
	
	@Column(name="assignment_que")
	private String assignment_Que;
	
	

	public String getAssignment_Que() {
		return assignment_Que;
	}

	public void setAssignment_Que(String assignment_Que) {
		this.assignment_Que = assignment_Que;
	}

	public Integer getAssignment_Id() {
		return assignment_Id;
	}

	public void setAssignment_Id(Integer assignment_Id) {
		this.assignment_Id = assignment_Id;
	}

	public Integer getUser_master_Id() {
		return user_master_Id;
	}

	public void setUser_master_Id(Integer user_master_Id) {
		this.user_master_Id = user_master_Id;
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

	
	public Integer getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}

	

	

	

	
	
}
