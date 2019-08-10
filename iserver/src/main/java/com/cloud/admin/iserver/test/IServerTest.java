package com.cloud.admin.iserver.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 韩炜
 * @date 2019-08-10 18:00
 */
@FeignClient(name = "server",fallback = ServerTestFallback.class)
public interface IServerTest {

    @RequestMapping(value = "feignHello")
    public String feignHello(@RequestParam("param") String param);
}
