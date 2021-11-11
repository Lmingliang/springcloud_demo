package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author lml
 * @date 2020/07/21 16:36
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface UserClientService {

    @RequestMapping(value = "/user/list", method = RequestMethod.GET)
    List<User> list();

}
