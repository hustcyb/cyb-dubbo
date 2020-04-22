package com.cyb.dubbo.api.service.dto.bug;

import java.io.Serializable;

/**
 * 父类
 * 
 * @author Administrator
 *
 */
public class BaseDTO implements Serializable {

	/**
	 * 序列化版本号
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 父类Id
	 */
	private Long id;
	
	public BaseDTO(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
