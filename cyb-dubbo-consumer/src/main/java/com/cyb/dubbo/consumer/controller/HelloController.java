package com.cyb.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.dubbo.api.service.HelloService;

@RequestMapping("hello")
@RestController
public class HelloController {
	
	@Reference
	private HelloService helloService;

	@GetMapping("sayHello")
	public String sayHello() {
		return helloService.sayHello();
	}
}
