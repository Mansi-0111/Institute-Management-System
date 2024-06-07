package com.admin.dao;

import java.util.List;

import com.admin.model.Course;
import com.admin.model.Exam_QA;
import com.admin.model.UserMaster;

public interface ExamqaDao {

	public void addExamqa(Exam_QA exam_QA);
	
	public List<Exam_QA> listExam_QAs();
	
	public Exam_QA getExam_QA(int exam_qa_id);
	
	public void deleteExam_QA(Exam_QA exam_QA);
	
	public List<Course> listCourses();
	
	public List<UserMaster> listUserMasters();
}
