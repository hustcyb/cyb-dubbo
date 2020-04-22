package com.cyb.dubbo.consumer.controller.bug;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.dubbo.api.service.bug.InheritanceBugService;
import com.cyb.dubbo.api.service.dto.bug.InheritanceDTO;

/**
 * 演示父子类有相同属性传输时属性值丢失的控制器
 * 
 * {@link https://www.toutiao.com/i6750543857512890887/}}
 * @author Administrator
 *
 */
@RequestMapping("bugs/inheritance")
@RestController
public class InheritanceBugController {

	/**
	 * 日志接口
	 */
	private static final Logger logger = LoggerFactory.getLogger(InheritanceBugController.class);

	@Reference
	private InheritanceBugService inheritanceService;

	@GetMapping
	public InheritanceDTO test() {
		InheritanceDTO inheritance = inheritanceService.test();
		logger.info("inheritane = {}", inheritance);

		return inheritance;
	}
}
