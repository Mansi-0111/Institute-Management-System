package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Exam_QA")
public class Exam_QA {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "exam_qa_id")
	private Integer exam_qa_Id;
	
	@Column(name = "user_master_id")
	private Integer user_master_Id;
	
	@Column(name = "course_id")
	private Integer course_Id;
	
	@Column(name="exam_question")
	private String exam_Question;
	
	@Column(name="option1")
	private String optionE1;
	
	@Column(name="option2")
	private String optionE2;
	
	@Column(name="option3")
	private String optionE3;
	
	@Column(name="option4")
	private String optionE4;
	
	@Column(name="correctans")
	private String correctAns;
	
	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}
	
	public Integer getExam_qa_Id() {
		return exam_qa_Id;
	}

	public void setExam_qa_Id(Integer exam_qa_Id) {
		this.exam_qa_Id = exam_qa_Id;
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

	public String getExam_Question() {
		return exam_Question;
	}

	public void setExam_Question(String exam_Question) {
		this.exam_Question = exam_Question;
	}

	

	public String getOptionE1() {
		return optionE1;
	}

	public void setOptionE1(String optionE1) {
		this.optionE1 = optionE1;
	}

	public String getOptionE2() {
		return optionE2;
	}

	public void setOptionE2(String optionE2) {
		this.optionE2 = optionE2;
	}

	public String getOptionE3() {
		return optionE3;
	}

	public void setOptionE3(String optionE3) {
		this.optionE3 = optionE3;
	}

	public String getOptionE4() {
		return optionE4;
	}

	public void setOptionE4(String optionE4) {
		this.optionE4 = optionE4;
	}
	
	
}
