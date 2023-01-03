package com.CourseWork1.CloudCom;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message" , "Hello World..!!");
		return "Welcome";
	}
}
