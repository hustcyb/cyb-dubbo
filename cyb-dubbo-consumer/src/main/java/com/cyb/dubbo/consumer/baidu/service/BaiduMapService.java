package com.cyb.dubbo.consumer.baidu.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cyb.dubbo.consumer.baidu.dto.LocationDTO;

/**
 * 百源地图定服务
 * 
 * @see http://lbsyun.baidu.com/index.php?title=webapi/ip-api
 * @author Administrator
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Path("location")
public interface BaiduMapService {

	/**
	 * 根据IP获取位置信息
	 * 
	 * @param ak   开发者密钥
	 * @param ip   ip地址，为空则根据请求ip定位
	 * @param coor 坐标类型
	 * @return 位置信息
	 */
	@GET
	@Path("ip")
	@Consumes(MediaType.APPLICATION_JSON)
	LocationDTO getByIp(@QueryParam("ak") String ak, @QueryParam("ip") String ip, @QueryParam("coor") String coor);

}
