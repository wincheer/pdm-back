package com.idata.pdm.dao;

import com.idata.pdm.entity.EmployeeProject;

public interface EmployeeProjectMapper {
    
	int deleteEmployeeProject(Integer employeeProjectId);

    int insertEmployeeProject(EmployeeProject record);

    EmployeeProject selectEmployeeProject(Integer employeeProjectId);

    int updateEmployeeProject(EmployeeProject record);

}