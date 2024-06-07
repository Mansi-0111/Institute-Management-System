package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="lectureSchedule")
public class LectureSchedule {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "lectureschedule_id")
	private Integer lectureschedule_Id;
	
	@Column(name = "course_id")
	private Integer course_Id;
	
	@Column(name = "subjectname")
	private String subjectname;
	
	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	@Column(name = "subject_id")
	private Integer subject_Id;
	
	@Column(name="lectureschedule_date")
	private String lectureschedule_Date;
	
	@Column(name="lectureschedule_from")
	private String lectureschedule_From;
	
	@Column(name="lectureschedule_to")
	private String lectureschedule_To;

	public Integer getLectureschedule_Id() {
		return lectureschedule_Id;
	}

	public void setLectureschedule_Id(Integer lectureschedule_Id) {
		this.lectureschedule_Id = lectureschedule_Id;
	}

	public Integer getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}

	public Integer getSubject_Id() {
		return subject_Id;
	}

	public void setSubject_Id(Integer subject_Id) {
		this.subject_Id = subject_Id;
	}

	public String getLectureschedule_Date() {
		return lectureschedule_Date;
	}

	public void setLectureschedule_Date(String lectureschedule_Date) {
		this.lectureschedule_Date = lectureschedule_Date;
	}

	public String getLectureschedule_From() {
		return lectureschedule_From;
	}

	public void setLectureschedule_From(String lectureschedule_From) {
		this.lectureschedule_From = lectureschedule_From;
	}

	public String getLectureschedule_To() {
		return lectureschedule_To;
	}

	public void setLectureschedule_To(String lectureschedule_To) {
		this.lectureschedule_To = lectureschedule_To;
	}
	
	

	



	
}

