package com.cyb.dubbo.consumer.baidu.dto;

/**
 * 坐标信息
 * 
 * @author Administrator
 *
 */
public class PointDTO {

	/**
	 * 当前城市中心点经度
	 */
	private String x;

	/**
	 * 当前城市中心点纬度
	 */
	private String y;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
}
