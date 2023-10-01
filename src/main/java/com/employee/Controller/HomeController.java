package com.employee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@PostMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	
}
