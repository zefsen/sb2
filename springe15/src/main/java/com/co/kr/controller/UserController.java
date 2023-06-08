package com.co.kr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j 
@RequestMapping(value = "/")
public class UserController {

	// 진입점
	@GetMapping("/index")
	public String index(){
		return "index.html";
	}
	@GetMapping("/register")
	public String register(){
		return "login/register.html";
	}
	@GetMapping("/blog-home")
	public String blog(){
		return "blog/blog-home.html";
	}
	@GetMapping("/home")
	public String home(){
		return "blog/home.html";
	}
}