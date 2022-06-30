package com.add.me;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class customervalid {
	
	
	private String Firstname;
	
	@NotNull()
	@Size(min=1,message="Please enter the last name is required")	
	private String Lastname;
	
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public customervalid() {
		
		Firstname = getFirstname();
		Lastname = getLastname();
	}
	
	
	
	

}
