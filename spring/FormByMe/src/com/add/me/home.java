package com.add.me;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class home {
	
	
	@RequestMapping("/")
	public String show()
	{
		return "main-menu";
	}
	
	@RequestMapping("/form")
	public String form()
	{
		return "form";
	}
	



}
