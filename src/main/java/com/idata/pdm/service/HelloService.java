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
public class HelloService
{
	private final static Logger logger = LoggerFactory.getLogger(HelloService.class);
	
	@Autowired
	private EmployeeMapper dao;

//	public Role selectRoleByPk(int roleId)
//	{
//		logger.info("RoleID = " + roleId);
//		return dao.selectByPrimaryKey(roleId);
//	}

	public Employee login(Employee employee)
	{
		return dao.login(employee);
	}
	
}
