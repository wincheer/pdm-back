package com.idata.pdm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idata.pdm.dao.FolderMapper;
import com.idata.pdm.dao.ProjectMapper;
import com.idata.pdm.dao.TemplateFolderMapper;
import com.idata.pdm.entity.Folder;
import com.idata.pdm.entity.Project;

@Service
@Transactional
public class ProjectService
{
	private final static Logger logger = LoggerFactory.getLogger(ProjectService.class);
	
	@Autowired
	private ProjectMapper projectDao;
	@Autowired
	private TemplateFolderMapper templateFolderDao;
	@Autowired
	private FolderMapper folderDao;

	public int insertProject(Project project) {
		
		int effectRows =  projectDao.insertProject(project); 
		int projectId = project.getProjectId();
		logger.info("Project ID = " + projectId);
		Folder folder = new Folder();
		folder.setProjectId(projectId);
		folder.setFolderName("测试一下事务中可否取得另一个新增实体的ID");
		folderDao.insertFolder(folder);
		
		/**
		//获取模板对应的目录，然后插入 folder中
		List<TemplateFolder> templateFolderList = templateFolderDao.selectTemplateFolderList(project.getTemplateId());
		//变成树状结构 - 父子关系
		//转换为folder
		List<Folder> folderList = new ArrayList<Folder>();
		for(TemplateFolder tf:templateFolderList){
			Folder folder = new Folder();
			folder.setProjectId(projectId);
			folder.setFolderName(tf.getTemplateFolderName());
			//空下parent_id
		}
		//插入folder中
		
		**/
		
		return effectRows;
	}

	
}
