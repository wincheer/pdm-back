package com.idata.pdm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idata.pdm.dao.TemplateMapper;
import com.idata.pdm.entity.Template;

@Service
@Transactional
public class TemplateService
{
	//private final static Logger logger = LoggerFactory.getLogger(TemplateService.class);
	
	@Autowired
	private TemplateMapper dao;


	public List<Template> selectTemplateList()
	{
		return dao.selectTemplateList();
	}

	
}
