package com.admin.dao;

import java.util.List;

import com.admin.model.Employee;

/**
 * @author Dinesh Rajput
 *
 */
public interface EmployeeDao {
	
	public void addEmployee(Employee employee);

	public List<Employee> listEmployeess();
	
	public Employee getEmployee(int empid);
	
	public void deleteEmployee(Employee employee);
}
