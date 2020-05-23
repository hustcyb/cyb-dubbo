package com.cyb.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.dubbo.api.service.GroupService;

/**
 * 分组示例控制器
 * 
 * @author Administrator
 *
 */
@RequestMapping("groups")
@RestController
public class GroupController {

	/**
	 * 分组1示例服务
	 */
	@Reference(group = "group1")
	private GroupService group1Service;
	
	/**
	 * 分组2示例服务
	 */
	@Reference(group = "group2")
	private GroupService group2Service;
	
	/**
	 * 测试分组1
	 * 
	 * @return 测试信息
	 */
	@GetMapping("group1")
	public String testGroup1() {
		return group1Service.test();
	}
	
	/**
	 * 测试分组2
	 * 
	 * @return 测试信息
	 */
	@GetMapping("group2")
	public String testGroup2() {
		return group2Service.test();
	}
}
