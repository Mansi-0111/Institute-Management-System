package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;

@Repository("studentregistrationDao")
public class StudentRegistrationDaoImpl implements StudentRegistrationDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addStudent(UserMaster userMaster) {
		sessionFactory.getCurrentSession().saveOrUpdate(userMaster);//database ma update ne insert kari aavse
	}
	

	@SuppressWarnings("unchecked")
	public List<UserMaster> listStudentRegistrations() {
		return (List<UserMaster>) sessionFactory.getCurrentSession().createCriteria(UserMaster.class).list();
	}
//id>0 update  id==0 insert
	public UserMaster getStudentRegistration(int user_master_Id) {
		return (UserMaster) sessionFactory.getCurrentSession().get(UserMaster.class, user_master_Id);
	}

	public void deletStudent(UserMaster userMaster) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM UserMaster WHERE user_master_Id = "+userMaster.getUser_master_Id()).executeUpdate();
	
	}
	
	@Override
	public List<UserType> listUserTypes()
	{
		return(List<UserType>) sessionFactory.getCurrentSession().createCriteria(UserType.class).list();
	}
	
	public List<Object[]> listlecture()
	{
		String sql = "SELECT concat(lectureschedule_from,' - ',lectureschedule_to) as timing,\r\n"
				+ "       MAX(CASE WHEN lectureschedule_date = date(now()) THEN subjectname END) AS `Today`,\r\n"
				+ "       MAX(CASE WHEN lectureschedule_date = date(now() + interval 1 day) THEN subjectname END) AS `Tomorrow`\r\n"
				+ "FROM lectureschedule\r\n"
				+ "GROUP BY lectureschedule_from, lectureschedule_to\r\n"
				+ "ORDER BY 1";
		return(List<Object[]>) sessionFactory.getCurrentSession().createNativeQuery(sql).list();
	}
	
	
	@Override
	public List<Course> listCourses()
	{
		return(List<Course>) sessionFactory.getCurrentSession().createCriteria(Course.class).list();
	}
	

}
