package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Course;
import com.admin.model.OnlineExam;
import com.admin.model.UserMaster;


@Repository("onlineexamDao")
public class OnlineExamDaoImpl implements OnlineExamDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addOnlineExam(OnlineExam onlineExam) {
		sessionFactory.getCurrentSession().saveOrUpdate(onlineExam);//database ma update ne insert kari aavse
	}
	
	@SuppressWarnings("unchecked")
	public List<OnlineExam> listOnlineExams() {
		return (List<OnlineExam>) sessionFactory.getCurrentSession().createCriteria(OnlineExam.class).list();
	}
	
	public OnlineExam getOnlineExam(int onlineexam_id) {
		return (OnlineExam) sessionFactory.getCurrentSession().get(OnlineExam.class, onlineexam_id);
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
