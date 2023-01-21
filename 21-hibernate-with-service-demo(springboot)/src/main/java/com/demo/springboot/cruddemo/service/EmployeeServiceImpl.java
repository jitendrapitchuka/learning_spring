package com.demo.springboot.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.springboot.cruddemo.dao.EmployeeDao;
import com.demo.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {


	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao theEmployeeDao) {
		employeeDao=theEmployeeDao;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		return employeeDao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		
		return employeeDao.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDao.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDao.deleteById(theId);

	}

}
