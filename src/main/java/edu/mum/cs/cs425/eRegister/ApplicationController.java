package edu.mum.cs.cs425.eRegister;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController
{
	@GetMapping("/index")
	public  String goHome()
	{
		return "index";
	}

}
