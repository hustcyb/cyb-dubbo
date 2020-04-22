package com.cyb.dubbo.consumer.baidu.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 位置结构化信息
 * 
 * @author Administrator
 *
 */
@JsonNaming(SnakeCaseStrategy.class)
public class LocationContentDTO {

	/**
	 * 简要地址信息
	 */
	private String address;

	/**
	 * 结构化地址信息
	 */
	private AddressDTO addressDetail;

	/**
	 * 坐标信息
	 */
	private PointDTO point;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AddressDTO getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(AddressDTO addressDetail) {
		this.addressDetail = addressDetail;
	}

	public PointDTO getPoint() {
		return point;
	}

	public void setPoint(PointDTO point) {
		this.point = point;
	}
}
