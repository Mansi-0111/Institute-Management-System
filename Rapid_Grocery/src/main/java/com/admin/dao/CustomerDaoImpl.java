package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> listCustomers() {
		return (List<Customer>) sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
	}

	public Customer getCustomer(int c_id) {
		return (Customer) sessionFactory.getCurrentSession().get(Customer.class, c_id);
	}

	public void deleteCustomer(Customer customer) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Customer WHERE c_id = "+customer.getC_id()).executeUpdate();
	}

}
