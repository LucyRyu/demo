package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MainController {

	@Value("${value}") private String value;

	
	@RequestMapping(value = { "/hello", "/" })
	public String main() {
		System.out.print(value);
		return "main";
	}
}
