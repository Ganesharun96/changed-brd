package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class UserRolesTableid implements Serializable {

	private static final long serialVersionUID = 863484984941575429L;
	private Usersdetails usersdetails;
	private Rolestable rolestable;
	@ManyToOne
	public Usersdetails getUsersdetails() {
		return usersdetails;
	}
	public void setUsersdetails(Usersdetails usersdetails) {
		this.usersdetails = usersdetails;
	}
	@ManyToOne
	public Rolestable getRolestable() {
		return rolestable;
	}
	public void setRolestable(Rolestable rolestable) {
		this.rolestable = rolestable;
	}
	

}
