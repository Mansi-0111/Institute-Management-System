package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Assignment;
import com.admin.model.Assignment_upload;
import com.admin.model.Course;
import com.admin.model.UserMaster;


@Repository("assignmentuploadDao")
public class AssignmentuploadDaoImpl implements AssignmentuploadDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addAssignment(Assignment_upload assignment) {
		sessionFactory.getCurrentSession().saveOrUpdate(assignment);//database ma update ne insert kari aavse
	}
	
	/*
	 * @SuppressWarnings("unchecked") public List<Assignment_upload>
	 * listAssignments() { return (List<Assignment>)
	 * sessionFactory.getCurrentSession().createCriteria(Assignment.class).list(); }
	 */
//id>0 update  id==0 insert
	public Assignment getAssignment(int assignment_id) {
		return (Assignment) sessionFactory.getCurrentSession().get(Assignment.class, assignment_id);
	}
	
	@Override
	public List<UserMaster> listUserMasters()
	{
		return(List<UserMaster>) sessionFactory.getCurrentSession().createCriteria(UserMaster.class).list();
	}
	
	@Override
	public List<Course> listCourses()
	{
		return(List<Course>) sessionFactory.getCurrentSession().createCriteria(Course.class).list();
	}
	
}
