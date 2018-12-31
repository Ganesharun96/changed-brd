package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class CustomerModel {

	private Integer customerCode;
	private String customerName;
	private String customerAddress;
	private String customerPincode;
	private String customerEmail;
	private String customerNumber;
//	@DateTimeFormat(pattern="MM/dd/yyyy")
	
	private String registrationDate;
	private String createdBy;
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private String modifiedDate;
	

	
	@Id 
	public Integer getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(Integer customerCode) {
		this.customerCode = customerCode;
	}
	@NotEmpty
	@Pattern(regexp="[a-zA-Z0-9]+", message="Wrong input!")

	@Size(max=30)
    public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}@NotEmpty
	@Size(max=100,message="Your Address should be between 100 characters.")
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@NotEmpty
//	@Length(min=6,max=6, message="Pincode is invalid")
	@Pattern(regexp=".{6}", message="Wrong pincode")
    public String getCustomerPincode() {
		return customerPincode;
	}
	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}
	
	@javax.validation.constraints.Email
	@NotEmpty
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	@Length(max=20)
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	@NotEmpty
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	@NotEmpty
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

//	@Pattern(regexp="MM/dd/yyyy")
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


}
