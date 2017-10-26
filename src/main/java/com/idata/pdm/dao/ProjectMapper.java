package com.idata.pdm.dao;

import com.idata.pdm.entity.Project;

public interface ProjectMapper {

	int deleteProject(Integer projectId);

    int insertProject(Project record);

    Project selectProject(Integer projectId);

    int updateProject(Project record);
}