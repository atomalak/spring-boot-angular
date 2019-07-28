package com.ttmanagement.issuemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Table(name="ISSUE")
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Issue extends BaseEntity{

	private static final long serialVersionUID = 1251596700179818659L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="DESCRIPTION",length=400)
	private String description;
	
	@Column(name="OPEN_ISSUE_DATE")
	private Date openIssueDate;
	
	@Column(name="DETAILS",length=4000)
	private String details;
	
	@Enumerated(EnumType.STRING)
	private IssueStatus issueStatus;
	
	@JoinColumn(name="ASSIGN_USER_ID")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private User user;
	
	@JoinColumn(name="PROJECT_ID")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Project project;
	
	

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getOpenIssueDate() {
		return openIssueDate;
	}

	public void setOpenIssueDate(Date openIssueDate) {
		this.openIssueDate = openIssueDate;
	}

	public IssueStatus getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(IssueStatus issueStatus) {
		this.issueStatus = issueStatus;
	}
	
	
	
	

}
