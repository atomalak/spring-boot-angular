package com.ttmanagement.dto;

import java.util.Date;

import com.ttmanagement.issuemanagement.entity.IssueStatus;

import lombok.Data;

@Data
public class IssueDto {

	private Long id;
	private String description;
	private String details;
	private IssueStatus issueStatus;
	private Date openIssueDate;
	private UserDto users;
	private ProjectDto projects;
}
