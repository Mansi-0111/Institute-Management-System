package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Course;
import com.admin.model.ExamSchedule;
import com.admin.model.UserMaster;

@Repository("examscheduleDao")
public class ExamScheduleDaoImpl implements ExamScheduleDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addExamSchedule(ExamSchedule examSchedule) {
		sessionFactory.getCurrentSession().saveOrUpdate(examSchedule);//database ma update ne insert kari aavse
	}

	@SuppressWarnings("unchecked")
	public List<ExamSchedule> listExamSchedules() {
		return (List<ExamSchedule>) sessionFactory.getCurrentSession().createCriteria(ExamSchedule.class).list();
	}
//id>0 update  id==0 insert
	public ExamSchedule getExamSchedule(int examschedule_id) {
		return (ExamSchedule) sessionFactory.getCurrentSession().get(ExamSchedule.class, examschedule_id);
	}

	public void deleteExamSchedule(ExamSchedule examSchedule) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM ExamSchedule WHERE examschedule_Id = "+examSchedule.getExamschedule_Id()).executeUpdate();
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
