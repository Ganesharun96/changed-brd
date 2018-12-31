package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Rolestable {
	private Integer id;
	private String roleadmin;
	private String roleuser;
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleadmin() {
		return roleadmin;
	}
	public void setRoleadmin(String roleadmin) {
		this.roleadmin = roleadmin;
	}
	public String getRoleuser() {
		return roleuser;
	}
	public void setRoleuser(String roleuser) {
		this.roleuser = roleuser;
	}
	
}
