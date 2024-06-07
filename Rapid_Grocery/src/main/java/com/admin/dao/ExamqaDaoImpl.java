package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Course;
import com.admin.model.Exam_QA;
import com.admin.model.UserMaster;

@Repository("examqaDao")
public class ExamqaDaoImpl implements ExamqaDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addExamqa(Exam_QA exam_QA) {
		sessionFactory.getCurrentSession().saveOrUpdate(exam_QA);
	}
	
	public List<Exam_QA> listExam_QAs() {
		return (List<Exam_QA>) sessionFactory.getCurrentSession().createCriteria(Exam_QA.class).list();
	}

	public Exam_QA getExam_QA(int exam_qa_id) {
		return (Exam_QA) sessionFactory.getCurrentSession().get(Exam_QA.class, exam_qa_id);
	}

	public void deleteExam_QA(Exam_QA exam_QA) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Exam_QA WHERE exam_qa_id = "+exam_QA.getExam_qa_Id()).executeUpdate();
	}
	
	@Override
	public List<Course> listCourses()
	{
		return(List<Course>) sessionFactory.getCurrentSession().createCriteria(Course.class).list();
	}
	
	@Override
	public List<UserMaster> listUserMasters()
	{
		return(List<UserMaster>) sessionFactory.getCurrentSession().createCriteria(UserMaster.class).list();
	}
	
	

}
