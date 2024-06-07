package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="examschedule")
public class ExamSchedule {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "examschedule_id")
	private Integer examschedule_Id;
	
	@Column(name = "user_master_id")
	private Integer user_master_Id;
	
	@Column(name = "course_id")
	private Integer course_Id;
	
	@Column(name="examschedule_date")
	private String examschedule_Date;

	public Integer getExamschedule_Id() {
		return examschedule_Id;
	}

	public void setExamschedule_Id(Integer examschedule_Id) {
		this.examschedule_Id = examschedule_Id;
	}

	public Integer getUser_master_Id() {
		return user_master_Id;
	}

	public void setUser_master_Id(Integer user_master_Id) {
		this.user_master_Id = user_master_Id;
	}

	public Integer getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}

	public String getExamschedule_Date() {
		return examschedule_Date;
	}

	public void setExamschedule_Date(String examschedule_Date) {
		this.examschedule_Date = examschedule_Date;
	}
	
	
	
}
