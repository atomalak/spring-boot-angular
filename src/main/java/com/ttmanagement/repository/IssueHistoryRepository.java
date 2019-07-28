package com.ttmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ttmanagement.issuemanagement.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

}
