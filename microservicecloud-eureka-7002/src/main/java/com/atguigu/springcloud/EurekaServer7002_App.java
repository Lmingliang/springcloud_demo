package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务注册
 *
 * @author lml
 * @date 2020/01/09 16:40
 */
@EnableEurekaServer // EurekaServer服务器端启动类,接受其他微服务注册进来
@SpringBootApplication
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
