package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAppController {
	
    
	@GetMapping("/index")
	  public String indexForm(Model model) {
	    model.addAttribute("info", new Info());
	    return "index";
	  }
	
	
}
