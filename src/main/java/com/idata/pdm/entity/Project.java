package com.idata.pdm.entity;

public class Project {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.project_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.template_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String templateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.project_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String projectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project.project_desc
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String projectDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.project_id
     *
     * @return the value of project.project_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.project_id
     *
     * @param projectId the value for project.project_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.template_id
     *
     * @return the value of project.template_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.template_id
     *
     * @param templateId the value for project.template_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.project_name
     *
     * @return the value of project.project_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.project_name
     *
     * @param projectName the value for project.project_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project.project_desc
     *
     * @return the value of project.project_desc
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getProjectDesc() {
        return projectDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project.project_desc
     *
     * @param projectDesc the value for project.project_desc
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }
}