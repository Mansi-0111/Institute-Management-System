package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="onlineexam")
public class OnlineExam {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "onlineexam_id")
	private Integer onlineexam_Id;
	
	@Column(name = "user_master_id")
	private Integer user_master_Id;
	
	@Column(name = "course_id")
	private Integer course_Id;
	
	@Column(name="total_marks")
	private Integer total_Marks;
	
	@Column(name="obtain_marks")
	private Integer obtain_Marks;
	
	@Column(name="exam_date")
	private String exam_Date;

	public Integer getOnlineexam_Id() {
		return onlineexam_Id;
	}

	public void setOnlineexam_Id(Integer onlineexam_Id) {
		this.onlineexam_Id = onlineexam_Id;
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

	public Integer getTotal_Marks() {
		return total_Marks;
	}

	public void setTotal_Marks(Integer total_Marks) {
		this.total_Marks = total_Marks;
	}

	public Integer getObtain_Marks() {
		return obtain_Marks;
	}

	public void setObtain_Marks(Integer obtain_Marks) {
		this.obtain_Marks = obtain_Marks;
	}

	public String getExam_Date() {
		return exam_Date;
	}

	public void setExam_Date(String exam_Date) {
		this.exam_Date = exam_Date;
	}
	
	
}
