package com.idata.pdm.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.idata.pdm.service.DocumentService;

@RestController
@CrossOrigin
public class DocumentAction {
	@Autowired
	private DocumentService docService;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public void upload(@RequestParam MultipartFile file, @RequestParam Map<String, Object> data) throws Exception {
		System.out.println(file.getOriginalFilename() + " 上传成功！");
		// f6e7412e9abec9de3a86476f0feec77b

	}

}