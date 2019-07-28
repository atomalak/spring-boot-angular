package com.ttmanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ttmanagement.issuemanagement.entity.Project;

public interface ProjectService {

	Project save(Project project);	
	Project getById(Long id);
	Page<Project> getAllPageable(Pageable pageable);
	List<Project> getByProjectCodeContains(String projectCode);
	void delete(Project project);
	
}
