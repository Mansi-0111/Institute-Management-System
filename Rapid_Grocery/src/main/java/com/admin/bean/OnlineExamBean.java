package com.admin.bean;

public class OnlineExamBean {
	Integer onlineexam_Id,total_Marks,obtain_Marks,user_master_Id,course_Id;
	String exam_Date;
	
	
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
