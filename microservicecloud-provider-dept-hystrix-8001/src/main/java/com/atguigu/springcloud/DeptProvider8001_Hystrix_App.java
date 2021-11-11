package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lml
 * @date 2020/01/09 11:37
 */
@EnableEurekaClient // 本服务启动后回自动注册进eureka服务器中
@SpringBootApplication
@EnableDiscoveryClient // 服务发现
@EnableCircuitBreaker // 对hystrix熔断机制的支持
public class DeptProvider8001_Hystrix_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}
