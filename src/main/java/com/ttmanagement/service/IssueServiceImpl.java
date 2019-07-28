package com.ttmanagement.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ttmanagement.dto.IssueDto;
import com.ttmanagement.issuemanagement.entity.Issue;
import com.ttmanagement.repository.IssueRepository;
import com.ttmanagement.util.Tpage;


@Service
public class IssueServiceImpl implements IssueService{
	
	@Autowired
	private  IssueRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	

	@Override
	public IssueDto save(IssueDto issueDto) {
		Issue issue=mapper.map(issueDto, Issue.class);
		issue=repository.save(issue);
		return mapper.map(issue, IssueDto.class);
	}

	@Override
	public IssueDto getById(Long id) {
		Issue issue= repository.getOne(id);
		return mapper.map(issue, IssueDto.class);
	}

	@Override
	public Tpage<IssueDto> getAllPageable(Pageable pageable) {
		Page<Issue> data=repository.findAll(pageable);
	    return  null;
	}

}
