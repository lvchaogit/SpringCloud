package com.lc.springcloud.configclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.lc.springcloud.configclient.mapper"})
public class ConfigClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
