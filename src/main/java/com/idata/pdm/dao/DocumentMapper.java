package com.idata.pdm.dao;

import com.idata.pdm.entity.Document;

public interface DocumentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    int deleteByPrimaryKey(Integer documentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    int insert(Document record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    int insertSelective(Document record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    Document selectByPrimaryKey(Integer documentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    int updateByPrimaryKeySelective(Document record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table document
     *
     * @mbg.generated Fri Oct 20 17:21:25 CST 2017
     */
    int updateByPrimaryKey(Document record);
}