package com.idata.pdm.action;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idata.pdm.service.DocumentVersionService;
import com.idata.pdm.service.FileService;

@RestController
@CrossOrigin
public class DocumentVersionAction
{
	private final static Logger logger = LoggerFactory.getLogger(DocumentVersionAction.class);

	@Autowired
	private DocumentVersionService docVerService;
	@Autowired
	private FileService fileService;
	@Value("${upload_path}")
	private String UPLOAD_PATH;

	@RequestMapping(value = "/docVerList", method = RequestMethod.GET)
	public List<Map<String, Object>> selectDocumentVersionList(@RequestParam int documentId) throws Exception
	{

		logger.info("documentId = " + documentId);

		List<Map<String, Object>> verList = docVerService.selectDocumentVersionList(documentId);
		return verList;
	}

	@RequestMapping(path = "/download", method = RequestMethod.GET)
	public ResponseEntity<Resource> download(@RequestParam int fileId)
			throws IOException
	{
		String fileName = fileService.selectFile(fileId).getFileName();
		File outputFile = new File(UPLOAD_PATH, fileName);
		Path path = Paths.get(outputFile.getAbsolutePath());
		Resource resource = new ByteArrayResource(Files.readAllBytes(path));

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-disposition", "attachment; filename=" + fileName);

		return ResponseEntity.ok()
				.headers(headers)
				.contentLength(outputFile.length())
				.contentType(MediaType.parseMediaType("application/octet-stream"))
				.body(resource);
	}

}