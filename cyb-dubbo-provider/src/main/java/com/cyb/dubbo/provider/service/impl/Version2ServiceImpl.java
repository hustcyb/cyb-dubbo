package com.cyb.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.cyb.dubbo.api.service.VersionService;

/**
 * 版本2服务
 * 
 * @author Administrator
 *
 */
@Service(protocol = "dubbo", version = "2")
public class Version2ServiceImpl implements VersionService {

	@Override
	public String test() {
		return "Hello, V2";
	}

}
