package com.example.demo.websecurity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.security.core.GrantedAuthority;

import com.example.demo.domain.Usersdetails;
@Entity
public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = 1315362811273934223L;
	private Integer id;
	private String authority;
	private Usersdetails usersdetails;

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
    @ManyToOne
	public Usersdetails getUsersdetails() {
		return usersdetails;
	}

	public void setUsersdetails(Usersdetails usersdetails) {
		this.usersdetails = usersdetails;
	}

	
	@Override
	public String getAuthority() {
		
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
