package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;




@Repository("facultyDao")
public class FacultyDaoImpl implements FacultyDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addFaculty(UserMaster userMaster) {
		sessionFactory.getCurrentSession().saveOrUpdate(userMaster);//database ma update ne insert kari aavse
	}
	
	@SuppressWarnings("unchecked")
	public List<UserMaster> listFacultyRegistrations() {
		return (List<UserMaster>) sessionFactory.getCurrentSession().createCriteria(UserMaster.class).list();
	}
//id>0 update  id==0 insert
	public UserMaster getFacultyRegistration(int user_master_Id) {
		return (UserMaster)sessionFactory.getCurrentSession().get(UserMaster.class, user_master_Id);
	}

	public void deleteFaculty(UserMaster userMaster) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM UserMaster WHERE user_master_Id = "+userMaster.getUser_master_Id()).executeUpdate();
	}	
	@Override
	public List<UserType> listUserTypes()
	{
		return(List<UserType>) sessionFactory.getCurrentSession().createCriteria(UserType.class).list();
	}
	
	@Override
	public List<Course> listCourses()
	{
		return(List<Course>) sessionFactory.getCurrentSession().createCriteria(Course.class).list();
	}
}

