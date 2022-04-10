package com.kadatechnologie.kadatech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
	@GetMapping("/pages-blank")
	public String pages() {
		return "pages-blank";
	}

}
