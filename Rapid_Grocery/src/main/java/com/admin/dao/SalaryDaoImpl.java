package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Salary;
import com.admin.model.UserMaster;

@Repository("salaryDao")
public class SalaryDaoImpl implements SalaryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addSalary(Salary salary) {
		sessionFactory.getCurrentSession().saveOrUpdate(salary);//database ma update ne insert kari aavse
	}
	
	@SuppressWarnings("unchecked")
	public List<Salary> listSalaries() {
		return (List<Salary>) sessionFactory.getCurrentSession().createCriteria(Salary.class).list();
	}
//id>0 update  id==0 insert
	public Salary getSalary(int salary_id) {
		return (Salary) sessionFactory.getCurrentSession().get(Salary.class, salary_id);
	}
	
	@Override
	public List<UserMaster> listUserMasters()
	{
		return(List<UserMaster>) sessionFactory.getCurrentSession().createCriteria(UserMaster.class).list();
	}
}
