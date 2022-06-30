package com.add.me;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class custform_confirmation {
	
	
	@RequestMapping("/showform")
	public String customer(Model themodel )
	{
		themodel.addAttribute("customer", new customervalid());
		
		return "cust-form";
	}
	
	
	
	@RequestMapping("/processform")
	public String mycust(@Valid @ModelAttribute("customer") customervalid thecustomer ,
			
		BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
		{
			
			return "confirm";
		}
		else
		{
		
		return "confirm";
		
		}
	}

}
