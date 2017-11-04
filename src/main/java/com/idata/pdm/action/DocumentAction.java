package com.idata.pdm.action;

import java.io.File;
import java.sql.Timestamp;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	@Value("${upload_path}")
	private String UPLOAD_PATH;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public void upload(@RequestParam MultipartFile file, @RequestParam Map<String, Object> data) throws Exception {

		//doc - file - ver
		//参数 file，docName,md5,projectId,employeeId
//		String originalFileName = file.getOriginalFilename();
//		String systemFileName = ""+System.currentTimeMillis();
//		File outputFile = new File(UPLOAD_PATH, file.getOriginalFilename());
//		file.transferTo(outputFile);
		
		System.out.println(data.toString());
	}

	@RequestMapping(value = "/checkMd5", method = RequestMethod.POST)
	public void upload(@RequestParam Map<String, Object> data) throws Exception {

		// System.out.println(file.getOriginalFilename());
		System.out.println(data.toString());
	}

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public void download(@RequestParam int fileId) throws Exception {

		// System.out.println(file.getOriginalFilename());
		System.out.println("File ID = " + fileId);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Timestamp ts = new Timestamp(System.currentTimeMillis());
			System.out.println(ts);

		}

	}
}