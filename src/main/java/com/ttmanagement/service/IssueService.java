package com.ttmanagement.service;

import org.springframework.data.domain.Pageable;

import com.ttmanagement.dto.IssueDto;
import com.ttmanagement.util.Tpage;

public interface IssueService {
    
	IssueDto save(IssueDto issue);	
	IssueDto getById(Long id);
	Tpage<IssueDto> getAllPageable(Pageable pageable);
}
