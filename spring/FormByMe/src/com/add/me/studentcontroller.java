package com.add.me;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class studentcontroller {
	
	private String firstname;
	
	private int id;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public studentcontroller(String firstname, int id) {
		
		this.firstname = firstname;
		this.id = id;
	}
	
	
	


}
