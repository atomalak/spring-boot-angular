package com.ttmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttmanagement.issuemanagement.entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long>{

}
