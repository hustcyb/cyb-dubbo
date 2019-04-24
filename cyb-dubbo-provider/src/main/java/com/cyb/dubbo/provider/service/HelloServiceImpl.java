package com.cyb.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;

import com.cyb.dubbo.api.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "Hello, World";
	}

}
