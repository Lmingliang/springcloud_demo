package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * 消费者
 * @author lml
 * @date 2020/01/09 11:30
 */
@EnableEurekaClient
@SpringBootApplication
// 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer70_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer70_App.class, args);
	}

}
