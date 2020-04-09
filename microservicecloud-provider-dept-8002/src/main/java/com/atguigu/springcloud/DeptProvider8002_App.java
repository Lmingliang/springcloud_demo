package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lml
 * @date 2020/01/09 11:37
 */
@EnableEurekaClient // 本服务启动后回自动注册进eureka服务器中
@SpringBootApplication
public class DeptProvider8002_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002_App.class, args);
	}
}
