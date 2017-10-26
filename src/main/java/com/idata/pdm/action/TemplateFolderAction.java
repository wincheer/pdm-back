package com.idata.pdm.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idata.pdm.common.TreeNode;
import com.idata.pdm.entity.TemplateFolder;
import com.idata.pdm.service.TemplateFolderService;

@RestController
@CrossOrigin
public class TemplateFolderAction {
	@Autowired
	private TemplateFolderService templateFolderService;

	@RequestMapping(value = "/templateFoderList", method = RequestMethod.GET)
	public List<TreeNode> selectTemplateFolderList(@RequestParam int templateId) throws Exception {

		List<TemplateFolder> templateFolderList = templateFolderService.selectTemplateFolderList(templateId);
		List<TreeNode> folderTree = builderTree(templateFolderList);

		return folderTree;
	}
	
	@RequestMapping(value = "/insertTemplateFolder", method = RequestMethod.POST)
	public int insertTemplateFolder(@RequestBody TemplateFolder folder) {

		int employeeId = templateFolderService.insertTemplateFolder(folder);

		return employeeId;
	}
	
	@RequestMapping(value = "/removeTemplateFolder", method = RequestMethod.GET)
	public int removeTemplateFolder(@RequestParam int templateFolderId) {
		return templateFolderService.deleteTemplateFolder(templateFolderId);
	}
	
	/************************* 下面的方法是内部私有辅助方法 ***************************/

	private List<TreeNode> builderTree(List<TemplateFolder> templateFolderList) {

		// 转换为TreeNode列表
		List<TreeNode> sourceTreeNodeList = new ArrayList<TreeNode>();
		for (TemplateFolder tf : templateFolderList) {
			TreeNode treeNode = new TreeNode(tf.getTemplateFolderId(), tf.getTemplateFolderName(),
					tf.getParentTemplateFolderId(),tf.getTemplateId());
			sourceTreeNodeList.add(treeNode);
		}
		// 生成树
		List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
		// 生成树 -- 添加根节点
		for (TreeNode node : sourceTreeNodeList) {
			if (node.getParentId() == 0) {
				treeNodeList.add(node);
			}
		}
		// 生成树 -- 递归填充子节点
		for (TreeNode node : treeNodeList) {
			node.setChildren(getChildList(node.getId(), sourceTreeNodeList));
		}

		return treeNodeList;
	}

	private List<TreeNode> getChildList(Integer id, List<TreeNode> sourceTreeNodeList) {

		List<TreeNode> childList = new ArrayList<TreeNode>();
		for (TreeNode node : sourceTreeNodeList) {
			if (node.getParentId().equals(id)) {
				childList.add(node);
			}
		}

		for (TreeNode node : childList) {
			node.setChildren(getChildList(node.getId(), sourceTreeNodeList));
		}

		if (childList.size() == 0) {
			childList = null;
		}

		return childList;
	}

}