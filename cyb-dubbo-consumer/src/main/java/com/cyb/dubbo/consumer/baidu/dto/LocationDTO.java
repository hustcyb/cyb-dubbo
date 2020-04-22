package com.cyb.dubbo.consumer.baidu.dto;

/**
 * 位置信息
 * 
 * @author Administrator
 *
 */
public class LocationDTO {

	/**
	 * 正常状态
	 */
	public static final Integer STATUS_OK = 0;

	/**
	 * 详细地址信息
	 */
	private String address;

	/**
	 * 位置结构化信息
	 */
	private LocationContentDTO content;

	/**
	 * 状态返回码
	 */
	private Integer status;

	/**
	 * 提示信息
	 */
	private String message;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocationContentDTO getContent() {
		return content;
	}

	public void setContent(LocationContentDTO content) {
		this.content = content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
