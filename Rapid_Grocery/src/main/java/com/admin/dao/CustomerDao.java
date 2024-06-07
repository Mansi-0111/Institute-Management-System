package com.admin.dao;

import java.util.List;

import com.admin.model.Customer;

public interface CustomerDao {
	public void addCustomer(Customer customer);

	public List<Customer> listCustomers();
	
	public Customer getCustomer(int c_id);
	
	public void deleteCustomer(Customer customer);
}
