package com.ttmanagement.issuemanagement.entity;

import javax.persistence.Column;
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
@Table(name="PROJECTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity {

	
	private static final long serialVersionUID = 2399417302050491373L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="PROJECT_CODE")
	private String projectCode;
	
	@Column(name="PROJECT_NAME")
	private String projectName;
	
	@JoinColumn(name="MANAGER_USER_ID")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private User manager;

}
