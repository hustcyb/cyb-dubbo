package com.cyb.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.dubbo.api.service.VersionService;

/**
 * 版本控制器
 * 
 * @author Administrator
 *
 */
@RequestMapping("versions")
@RestController
public class VersionController {

	/**
	 * 版本1服务
	 */
	@Reference(version = "1")
	private VersionService version1Service;

	/**
	 * 版本2服务
	 */
	@Reference(version = "2")
	private VersionService version2Service;

	/**
	 * 任意版本服务
	 */
	@Reference(version = "*")
	private VersionService versionAnyService;

	/**
	 * 测试版本1接口
	 * 
	 * @return 测试信息
	 */
	@GetMapping("v1")
	public String testV1() {
		return version1Service.test();
	}

	/**
	 * 测试版本2接口
	 * 
	 * @return 测试信息
	 */
	@GetMapping("v2")
	public String testV2() {
		return version2Service.test();
	}

	/**
	 * 测试任务版本接口
	 * 
	 * @return 测试信息
	 */
	@GetMapping("any")
	public String testAny() {
		return versionAnyService.test();
	}
}
