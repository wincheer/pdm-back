package com.idata.pdm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idata.pdm.dao.FolderMapper;

@Service
@Transactional
public class FolderService
{
	private final static Logger logger = LoggerFactory.getLogger(FolderService.class);
	
	@Autowired
	private FolderMapper dao;

	
}
