package com.cyb.dubbo.provider.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.cyb.dubbo.api.service.VersionService;

/**
 * V1版本服务实现
 * 
 * @author Administrator
 *
 */
@Service(protocol = "dubbo", version = "1")
public class Version1ServiceImpl implements VersionService {

	@Override
	public String test() {
		return "Hello, V1";
	}

}
