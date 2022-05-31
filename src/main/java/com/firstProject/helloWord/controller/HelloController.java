package com.firstProject.helloWord.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

	@GetMapping("/index")
	public String helloMessage() {
		return "index.html";
	}
}
