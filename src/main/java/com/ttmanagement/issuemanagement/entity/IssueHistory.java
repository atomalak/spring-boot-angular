package com.ttmanagement.issuemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Table(name="ISSUE_HISTORY")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IssueHistory extends BaseEntity{

	
	private static final long serialVersionUID = 839585326504605198L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@JoinColumn(name="ISSUE_ID")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Issue issue;
	
	@JoinColumn(name="ASSIGN_USER_ID")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private User user;

}
