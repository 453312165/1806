package com.tedu.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//Feign的接口
@FeignClient("provider-user")	//找到提供者，通过Eureka
public interface EurekaServiceFeign {
	//对提供者调用
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
}
