package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Course;
import com.admin.model.Fee;
import com.admin.model.UserMaster;

@Repository("feeDao")
public class FeeDaoImpl implements FeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addFee(Fee fee) {
		sessionFactory.getCurrentSession().saveOrUpdate(fee);//database ma update ne insert kari aavse
	}
	
	@SuppressWarnings("unchecked")
	public List<Fee> listFees(){
		return (List<Fee>) sessionFactory.getCurrentSession().createCriteria(Fee.class).list();
	}
//id>0 update  id==0 insert
	public Fee getFee(int fee_id) {
		return (Fee) sessionFactory.getCurrentSession().get(Fee.class, fee_id);
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
