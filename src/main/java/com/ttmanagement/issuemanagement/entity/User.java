package com.ttmanagement.issuemanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="USERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User extends BaseEntity{

	
	private static final long serialVersionUID = -7881911354223351764L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="USERNAME",length=100,unique=true)
	private String userName;
	
	
	@Column(name="PASSWORD",length=200)
	private String password;
	
	@Column(name="SURNAME",length=200)
	private String surName;
	
	@Column(name="EMAIL",length=100)
	private String email;
	
	
	@JoinColumn(name="ASSIGN_USER_ID")
	@OneToMany(fetch=FetchType.LAZY)
	private List<Issue> issueList;
	
}
