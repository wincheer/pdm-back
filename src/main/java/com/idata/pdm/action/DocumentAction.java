package com.idata.pdm.action;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.idata.pdm.entity.Document;
import com.idata.pdm.service.DocumentService;

@RestController
@CrossOrigin
public class DocumentAction {
	private final static Logger logger = LoggerFactory.getLogger(DocumentAction.class);
	
	@Autowired
	private DocumentService docService;
	@Value("${upload_path}")
	private String UPLOAD_PATH;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public void upload(@RequestParam MultipartFile file, @RequestParam Map<String, Object> data) {

		File outputFile = new File(UPLOAD_PATH, file.getOriginalFilename());
		try {
			file.transferTo(outputFile);
			docService.upload(data);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	@RequestMapping(value = "/quickUpload", method = RequestMethod.POST)
	public Map<String, Object> quickUpload(@RequestBody Map<String, Object> data) throws Exception {
		System.out.println(data.get("docName") + "==== 检查文件MD5");
		if (data.get("docName").equals("SzeliskiBook_20100903_draft.pdf")) {
			System.out.println("不用上传");
		} else {
			System.out.println("需要上传");
		}
		return data;
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
	
	@RequestMapping(value = "/docList", method = RequestMethod.GET)
	public List<Document> selectDocumentList(@RequestParam int folderId) throws Exception {

		return docService.selectFolderDocumentList(folderId);
	}

}