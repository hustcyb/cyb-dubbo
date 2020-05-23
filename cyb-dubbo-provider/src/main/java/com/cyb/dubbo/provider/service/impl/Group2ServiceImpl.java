package com.cyb.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.cyb.dubbo.api.service.GroupService;

/**
 * 版本2服务
 * 
 * @author Administrator
 *
 */
@Service(protocol = "dubbo", group = "group2")
public class Group2ServiceImpl implements GroupService {

	@Override
	public String test() {
		return "Hello, Group 2";
	}

}
