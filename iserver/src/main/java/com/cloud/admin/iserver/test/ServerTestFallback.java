package com.cloud.admin.iserver.test;

import org.springframework.stereotype.Component;

/**
 * @author 韩炜
 * @date 2019-08-10 18:52
 */
@Component
public class ServerTestFallback implements IServerTest {
    @Override
    public String feignHello(String param) {
        return "容错数据";
    }
}
