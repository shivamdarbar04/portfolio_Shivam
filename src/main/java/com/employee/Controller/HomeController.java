package com.employee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("/education")
	public String education()
	{
		return "education";
	}
	
	@RequestMapping("/portfolio")
	public String portfolio()
	{
		return "portfolio";
	}
	
	@RequestMapping("/skills")
	public String skills()
	{
		return "skills";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
}
