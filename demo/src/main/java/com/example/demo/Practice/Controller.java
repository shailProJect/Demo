package com.example.demo.Practice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping
	public String gettest(Model model)
	{
		model.addAttribute("message","hii Shailesh");
		return "test";
	}
	
}
