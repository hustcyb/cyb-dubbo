package com.cyb.dubbo.consumer.controller;

import java.util.Objects;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cyb.dubbo.consumer.baidu.dto.AddressDTO;
import com.cyb.dubbo.consumer.baidu.dto.LocationContentDTO;
import com.cyb.dubbo.consumer.baidu.dto.LocationDTO;
import com.cyb.dubbo.consumer.baidu.service.BaiduMapService;

/**
 * 百图地址API控制器
 * 
 * @author Administrator
 *
 */
@RequestMapping("baidu/map")
@RestController
public class BaiduMapController {

	/**
	 * 百度地图开发者密钥
	 */
	@Value("${baidu.map.api.ak}")
	private String ak;

	@Reference(url = "${baidu.map.api.url}")
	private BaiduMapService mapService;

	@GetMapping("ip")
	public AddressDTO getByIp(String ip) {
		LocationDTO location = mapService.getByIp(ak, ip, "bd09ll");
		Integer status = location.getStatus();
		if (!Objects.equals(status, LocationDTO.STATUS_OK)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, location.getMessage());
		}

		LocationContentDTO content = location.getContent();
		return content.getAddressDetail();
	}
}
