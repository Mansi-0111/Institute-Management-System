package com.admin.service;

import java.util.List;

import com.admin.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	public List<Customer> listCustomers();
	
	public Customer getCustomer(int c_id);
	
	public void deleteCustomer(Customer customer);
}
