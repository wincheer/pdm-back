package com.idata.pdm.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.idata.pdm.service.DocumentService;

@RestController
@CrossOrigin
public class DocumentAction
{
	@Autowired
	private DocumentService docService;
	@Value("${upload_path}")
	private String UPLOAD_PATH;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public void upload(@RequestParam MultipartFile file, @RequestParam Map<String, Object> data) throws Exception
	{

		//doc - file - ver
		//参数 file，docName,md5,projectId,employeeId
		//		String originalFileName = file.getOriginalFilename();
		//		String systemFileName = ""+System.currentTimeMillis();
		//		File outputFile = new File(UPLOAD_PATH, file.getOriginalFilename());
		//		file.transferTo(outputFile);

		System.out.println(data.get("docName") + "------------------ true upload");
	}

	@RequestMapping(value = "/quickUpload", method = RequestMethod.POST)
	public Map<String, Object> quickUpload(@RequestBody Map<String, Object> data) throws Exception
	{
		System.out.println(data.get("docName") + "==== 检查文件MD5");
		if (data.get("docName").equals("SzeliskiBook_20100903_draft.pdf"))
		{
			System.out.println("不用上传");
		}
		else
		{
			System.out.println("需要上传");
		}
		return data;
	}

	@RequestMapping(value = "/checkMd5", method = RequestMethod.POST)
	public void upload(@RequestParam Map<String, Object> data) throws Exception
	{

		// System.out.println(file.getOriginalFilename());
		System.out.println(data.toString());
	}

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public void download(@RequestParam int fileId) throws Exception
	{

		// System.out.println(file.getOriginalFilename());
		System.out.println("File ID = " + fileId);
	}

}