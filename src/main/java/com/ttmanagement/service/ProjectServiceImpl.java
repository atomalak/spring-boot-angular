package com.ttmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ttmanagement.issuemanagement.entity.Project;
import com.ttmanagement.repository.ProjectRepository;


@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectRepository repository;

	@Override
	public Project save(Project project) {
		return repository.save(project);
	}

	@Override
	public Project getById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Page<Project> getAllPageable(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public List<Project> getByProjectCodeContains(String projectCode) {
	   return repository.getByProjectCodeContains(projectCode);
	}

	@Override
	public void delete(Project project) {
	   repository.delete(project);
	}

}
