package com.cloud.admin.server.test;

import com.cloud.admin.iserver.test.IServerTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 韩炜
 * @date 2019-08-10 16:56
 */
@RestController
public class ServerTest implements IServerTest {

    @RequestMapping(value = "ribbonHello")
    public String ribbonHello(@RequestParam("param") String param){
        throw new RuntimeException();
        //return "ribbon:"+param;
    }

    @Override
    public String feignHello(String param) {
        throw new RuntimeException();
        //return "feign:"+param;
    }
}
