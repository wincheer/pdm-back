package com.idata.pdm.common;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	private Integer id;
	private Integer templateId;
	private String label;
	private Integer parentId;
	private List<TreeNode> children = new ArrayList<TreeNode>();

	public TreeNode() {
	}

	public TreeNode(Integer id, String label, Integer parentId,Integer templateId) {
		this.id = id;
		this.label = label;
		this.parentId = parentId;
		this.templateId = templateId;
	}

	public Integer getId() {
		return id;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

}
