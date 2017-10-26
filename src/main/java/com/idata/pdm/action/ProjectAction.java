package com.idata.pdm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.idata.pdm.service.ProjectService;

@RestController
@CrossOrigin
public class ProjectAction
{
	@Autowired
	private ProjectService projectService;


}