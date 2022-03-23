package com.example.feign.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value="feignDemo",url="http://localhost:8080/v1")
public interface ServiceUtil {
	
	@GetMapping("/userDetails")
	String getUserDetails();
	
	@PostMapping("/userInfo")
	String postDetails();

}
