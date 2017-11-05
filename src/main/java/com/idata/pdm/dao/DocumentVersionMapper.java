package com.idata.pdm.dao;

import com.idata.pdm.entity.DocumentVersion;

public interface DocumentVersionMapper {

	int deleteDocumentVersion(Integer documentVersionId);

    int insertDocumentVersion(DocumentVersion record);

    DocumentVersion selectDocumentVersion(Integer documentVersionId);

    int updateDocumentVersion(DocumentVersion record);
}