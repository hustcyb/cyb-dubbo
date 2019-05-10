package com.cyb.dubbo.api.service.query;

import java.io.Serializable;

import javax.ws.rs.QueryParam;

public class StudentQuery implements Serializable {

	private static final long serialVersionUID = 1L;

	@QueryParam("name")
	private String name;
	
	@QueryParam("minAge")
	private Byte minAge;
	
	@QueryParam("maxAge")
	private Byte maxAge;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getMinAge() {
		return minAge;
	}

	public void setMinAge(Byte minAge) {
		this.minAge = minAge;
	}

	public Byte getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Byte maxAge) {
		this.maxAge = maxAge;
	}
}
