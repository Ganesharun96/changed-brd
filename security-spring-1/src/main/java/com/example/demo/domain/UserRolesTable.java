package com.example.demo.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class UserRolesTable {
	 
	private UserRolesTableid pk;
@EmbeddedId
	public UserRolesTableid getPk() {
		return pk;
	}

	public void setPk(UserRolesTableid pk) {
		this.pk = pk;
	}
	
	

}
