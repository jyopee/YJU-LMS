package com.stu.gary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class homeController {
	
	@GetMapping("/")
	public String home() {
		
		System.out.println("안녕하세요");
	
		return"index";
	}

}
