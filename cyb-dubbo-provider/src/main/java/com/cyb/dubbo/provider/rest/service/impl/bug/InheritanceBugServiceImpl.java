package com.cyb.dubbo.provider.rest.service.impl.bug;

import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cyb.dubbo.api.service.bug.InheritanceBugService;
import com.cyb.dubbo.api.service.dto.bug.InheritanceDTO;

/**
 * 演示父子类有相同属性传输时属性值丢失的实现代码
 * 
 * {@link https://www.toutiao.com/i6750543857512890887/}
 * @author Administrator
 *
 */
@Service(protocol = "dubbo")
public class InheritanceBugServiceImpl implements InheritanceBugService {

	/**
	 * 日志接口
	 */
	private static final Logger logger = LoggerFactory.getLogger(InheritanceBugServiceImpl.class);

	@Override
	public InheritanceDTO test() {
		InheritanceDTO inheritance = new InheritanceDTO(1L, 2L, "test");
		logger.info("inheritance = {}", inheritance);

		return inheritance;
	}

}
