package com.idata.pdm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idata.pdm.dao.EmployeeMapper;
import com.idata.pdm.entity.Employee;

@Service
@Transactional
public class EmployeeService
{
	private final static Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeMapper dao;

	public Employee login(Employee employee)
	{
		Employee emp = dao.login(employee);
		logger.info(emp.getDisplayName());
		
		return emp;
	}
	
}
