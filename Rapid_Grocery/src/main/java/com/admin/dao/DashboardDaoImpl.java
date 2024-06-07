package com.admin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


@Repository("dashboardDao")
public class DashboardDaoImpl implements DashboardDao{
	
	@Autowired
	private SessionFactory sessionFactory;


	public int userCount() {

    String sqlString="SELECT count(u) FROM UserMaster u";
	Session session = sessionFactory.getCurrentSession();
	Query query = session.createQuery(sqlString);
	Iterator count = query.iterate();
	//System.out.println("No. of rows : "+count.next()); 
	Long i = (Long) count.next();
	System.out.println("User Count : "+i);
	return Integer.parseInt(String.valueOf(i));
}


	@Override
	public int studentCount() {
	    String sqlString="SELECT count(u) FROM UserMaster u where user_type_Id= 3";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sqlString);
		Iterator count = query.iterate();
		//System.out.println("No. of rows : "+count.next()); 
		Long i = (Long) count.next();
		System.out.println("User Count : "+i);
		return Integer.parseInt(String.valueOf(i));
	}


	@Override
	public int staffCount() {
	    String sqlString="SELECT count(u) FROM UserMaster u where user_type_Id= 2";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sqlString);
		Iterator count = query.iterate();
		//System.out.println("No. of rows : "+count.next()); 
		Long i = (Long) count.next();
		System.out.println("User Count : "+i);
		return Integer.parseInt(String.valueOf(i));
	}
	

	@Override
	public int facultyCount() {
	    String sqlString="SELECT count(u) FROM UserMaster u where user_type_Id= 4";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sqlString);
		Iterator count = query.iterate();
		//System.out.println("No. of rows : "+count.next()); 
		Long i = (Long) count.next();
		System.out.println("User Count : "+i);
		return Integer.parseInt(String.valueOf(i));
	}
	
	
	@Override
	public int feedbackCount() {
	    String sqlString="select count(u) FROM Feedback u";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sqlString);
		Iterator count = query.iterate();
		//System.out.println("No. of rows : "+count.next()); 
		Long i = (Long) count.next();
		System.out.println("User Count : "+i);
		return Integer.parseInt(String.valueOf(i));
	}
	
	@Override
	public int inquiryCount() {
	    String sqlString="SELECT count(u) FROM Inquiry u";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sqlString);
		Iterator count = query.iterate();
		//System.out.println("No. of rows : "+count.next()); 
		Long i = (Long) count.next();
		System.out.println("User Count : "+i);
		return Integer.parseInt(String.valueOf(i));
	}
	
}
