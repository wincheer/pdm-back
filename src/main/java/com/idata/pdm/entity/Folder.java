package com.idata.pdm.entity;

public class Folder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column folder.folder_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private Integer folderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column folder.parent_folder_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private Integer parentFolderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column folder.project_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private Integer projectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column folder.folder_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String folderName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column folder.folder_desc
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String folderDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column folder.folder_id
     *
     * @return the value of folder.folder_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column folder.folder_id
     *
     * @param folderId the value for folder.folder_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column folder.parent_folder_id
     *
     * @return the value of folder.parent_folder_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public Integer getParentFolderId() {
        return parentFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column folder.parent_folder_id
     *
     * @param parentFolderId the value for folder.parent_folder_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setParentFolderId(Integer parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column folder.project_id
     *
     * @return the value of folder.project_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column folder.project_id
     *
     * @param projectId the value for folder.project_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column folder.folder_name
     *
     * @return the value of folder.folder_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column folder.folder_name
     *
     * @param folderName the value for folder.folder_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column folder.folder_desc
     *
     * @return the value of folder.folder_desc
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getFolderDesc() {
        return folderDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column folder.folder_desc
     *
     * @param folderDesc the value for folder.folder_desc
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setFolderDesc(String folderDesc) {
        this.folderDesc = folderDesc;
    }
}