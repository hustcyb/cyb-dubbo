package com.cyb.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.cyb.dubbo.api.service.GroupService;

/**
 * 分组1服务
 * 
 * @author Administrator
 *
 */
@Service(protocol = "dubbo", group = "group1")
public class Group1ServiceImpl implements GroupService {

	@Override
	public String test() {
		return "Hello, Group 1";
	}

}
