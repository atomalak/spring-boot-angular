package com.ttmanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ttmanagement.issuemanagement.entity.IssueHistory;
import com.ttmanagement.repository.IssueHistoryRepository;


@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {
	
	@Autowired
	private IssueHistoryRepository repository;

	@Override
	public IssueHistory save(IssueHistory history) {
		return repository.save(history);
	}

	@Override
	public IssueHistory getById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Page<IssueHistory> getAllPageable(Pageable pageable) {
		return repository.findAll(pageable);
	}

	

}
