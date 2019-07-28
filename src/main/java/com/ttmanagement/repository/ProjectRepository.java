package com.ttmanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ttmanagement.issuemanagement.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{
   
	Page<Project> findAll(Pageable pageable);
	List<Project> findAll(Sort sort);
	List<Project> getByProjectCodeContains(String projectCode);
}
