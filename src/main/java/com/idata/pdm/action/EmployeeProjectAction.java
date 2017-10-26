package com.idata.pdm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.idata.pdm.service.EmployeeProjectService;

@RestController
@CrossOrigin
public class EmployeeProjectAction
{
	@Autowired
	private EmployeeProjectService employeeProjectService;


}