package com.example.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.feign"})
@EnableFeignClients
public class FeigndetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeigndetailsApplication.class, args);
	}

}
