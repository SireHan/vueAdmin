package com.cloud.admin.client.test;

import com.cloud.admin.iserver.test.IServerTest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 韩炜
 * @date 2019-08-10 17:03
 */
@RestController
public class ClientTest {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IServerTest iServerTest;

    @RequestMapping(value = "/ribbonSay")
    @HystrixCommand(fallbackMethod = "fallback")
    public String ribbonSay(){
        return restTemplate.getForObject("http://server/ribbonHello?param=cloud",String.class);
    }

    public String fallback(){
        return "容错数据";
    }

    @RequestMapping(value = "/feignSay")
    public String feignSay(){
        return iServerTest.feignHello("cloud");
    }
}
