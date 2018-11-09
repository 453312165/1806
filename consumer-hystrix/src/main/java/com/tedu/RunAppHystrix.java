package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients			//开启Feign
//@EnableCircuitBreaker		//开启hystrix
public class RunAppHystrix {
	public static void main(String[] args) {
		SpringApplication.run(RunAppHystrix.class, args);
	}
}
