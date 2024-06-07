package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.ExamqaDao;
import com.admin.model.Course;
import com.admin.model.Exam_QA;
import com.admin.model.UserMaster;

@Service("examqaService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ExamqaServiceImpl implements ExamqaService {
	
	@Autowired
	private ExamqaDao examqaDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addExamqa(Exam_QA exam_QA) {
		examqaDao.addExamqa(exam_QA);
	}
	
	public List<Exam_QA> listExam_QAs() {
		return examqaDao.listExam_QAs();
	}

	public Exam_QA getExam_QA(int exam_qa_id) {
		return examqaDao.getExam_QA(exam_qa_id);
	}
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteExam_QA(Exam_QA exam_QA) {
		examqaDao.deleteExam_QA(exam_QA);
	}
	
	@Override
	public List<Course> listCourses(){
		return examqaDao.listCourses();
	}
	
	@Override
	public List<UserMaster> listUserMasters(){
		return examqaDao.listUserMasters();
	}

}
