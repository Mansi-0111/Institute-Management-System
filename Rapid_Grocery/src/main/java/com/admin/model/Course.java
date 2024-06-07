package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Integer course_Id;
	
	@Column(name="course_name")
	private String course_Name;

	public Integer getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}

	public String getCourse_Name() {
		return course_Name;
	}

	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	
	
	
}
