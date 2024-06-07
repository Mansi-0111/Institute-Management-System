package com.admin.dao;

import java.util.List;

import com.admin.model.Salary;
import com.admin.model.UserMaster;

public interface SalaryDao {

	public void addSalary(Salary salary) ;
	
	public List<Salary> listSalaries() ;
	
	public Salary getSalary(int salary_id);
	
	public List<UserMaster> listUserMasters();
}
