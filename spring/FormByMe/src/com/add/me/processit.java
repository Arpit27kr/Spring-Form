package com.add.me;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller																																																																	
	
public class processit {
	
	
	@RequestMapping("/processform")
	public String fshow(HttpServletRequest request,Model model)
	{
		{
			String para1 =request.getParameter("param1");
			
			
			
			int para2=Integer.parseInt(request.getParameter("param2"));
			
			
		
			model.addAttribute("par1", para1);
			
			model.addAttribute("par2", para2);
			
			
			return "sub";
			
			
	    }
	}
}
