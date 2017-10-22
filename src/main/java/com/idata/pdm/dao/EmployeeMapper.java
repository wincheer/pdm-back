package com.idata.pdm.dao;

import com.idata.pdm.entity.Employee;

public interface EmployeeMapper {

	Employee selectByPrimaryKey(Integer employeeId);
	
	int deleteByPrimaryKey(Integer employeeId);

    int insertSelective(Employee employee);

    int updateByPrimaryKeySelective(Employee employee);
    
    Employee login(Employee employee);
}