package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * feign注册
 *
 * @author lml
 * @date 2020/07/21 16:12
 */
@EnableEurekaClient
@SpringBootApplication
@ComponentScan("com.atguigu.springcloud")
@EnableFeignClients(basePackages = {"com.atguigu.springcloud"})
public class DeptConsumer70_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer70_Feign_App.class, args);
    }

}
