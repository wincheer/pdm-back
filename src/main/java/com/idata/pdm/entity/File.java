package com.idata.pdm.entity;

public class File {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.file_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.file_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.file_md5
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String fileMd5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file.file_location
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    private String fileLocation;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.file_id
     *
     * @return the value of file.file_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.file_id
     *
     * @param fileId the value for file.file_id
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.file_name
     *
     * @return the value of file.file_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.file_name
     *
     * @param fileName the value for file.file_name
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.file_md5
     *
     * @return the value of file.file_md5
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getFileMd5() {
        return fileMd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.file_md5
     *
     * @param fileMd5 the value for file.file_md5
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file.file_location
     *
     * @return the value of file.file_location
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public String getFileLocation() {
        return fileLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file.file_location
     *
     * @param fileLocation the value for file.file_location
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }
}