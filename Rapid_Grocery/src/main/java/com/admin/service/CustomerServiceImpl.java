package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.CustomerDao;
import com.admin.model.Customer;

@Service("customerService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	
	public List<Customer> listCustomers() {
		return customerDao.listCustomers();
	}

	public Customer getCustomer(int c_id) {
		return customerDao.getCustomer(c_id);
	}
	@Transactional
	public void deleteCustomer(Customer customer) {
		customerDao.deleteCustomer(customer);
	}
}
