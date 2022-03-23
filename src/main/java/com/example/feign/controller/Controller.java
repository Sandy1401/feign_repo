package com.example.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.util.ServiceUtil;

@RestController
@RequestMapping("/demo")
public class Controller {

	@Autowired
	private ServiceUtil serviceUtil;
	
	@GetMapping("/userDetails")
	public String getUserDetails() {
		return serviceUtil.getUserDetails();
	}
	
	@PostMapping("/addDetails")
	public String addDetails() {
		return serviceUtil.postDetails();
	}
	
}
