package com.idata.pdm.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idata.pdm.entity.Template;
import com.idata.pdm.service.TemplateService;

@RestController
@CrossOrigin
public class TemplateAction {
	@Autowired
	private TemplateService templateService;

	@RequestMapping(value = "/templateList", method = RequestMethod.GET)
	public List<Template> selectTemplateList() {
		List<Template> templateList = templateService.selectTemplateList();
		return templateList;
	}

}