package com.ttmanagement.issuemanagement.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@MappedSuperclass 
public class BaseEntity  implements Serializable{

	//Diğer entityler bu sınıftan türeyecek aşağıdaki fieldlara
	//otomatik diğer entitylerdede yer alacak 
	//bu sebeble bu sınıfın başına @MappedSuperClass koyduk
	
	private static final long serialVersionUID = -5279530129606900303L;
	
	@Column(name="CREATED_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name="CREATED_BY" ,length=100)
	private String createdBy;
	
	@Column(name="UPDATE_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@Column(name="UPDATED_BY",length=100)
	private String updatedBy;
	
	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
}
