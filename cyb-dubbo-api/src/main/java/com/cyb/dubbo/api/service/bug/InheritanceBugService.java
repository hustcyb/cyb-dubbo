package com.cyb.dubbo.api.service.bug;

import com.cyb.dubbo.api.service.dto.bug.InheritanceDTO;

/**
 * 演示父子类有相同属性传输时属性值丢失的接口
 * 
 * @author Administrator
 *
 */
public interface InheritanceBugService {

	/**
	 * 获取测试子类
	 * 
	 * @return 测试子类
	 */
	InheritanceDTO test();
}
