package com.ttmanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ttmanagement.issuemanagement.entity.IssueHistory;

public interface IssueHistoryService {

	IssueHistory save(IssueHistory history);	
	IssueHistory getById(Long id);
	Page<IssueHistory> getAllPageable(Pageable pageable);
}
