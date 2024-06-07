package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.SalaryDao;
import com.admin.model.Salary;
import com.admin.model.UserMaster;

@Service("salaryService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class SalaryServiceImpl  implements SalaryService{

	@Autowired
	private SalaryDao salaryDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addSalary(Salary salary) {
		salaryDao.addSalary(salary);
	}
	
	public List<Salary> listSalaries() {
		return salaryDao.listSalaries();
	}

	public Salary getSalary(int salary_id) {
		return salaryDao.getSalary(salary_id);
	}
	
	@Override
	public List<UserMaster> listUserMasters(){
		return salaryDao.listUserMasters();
	}
}
