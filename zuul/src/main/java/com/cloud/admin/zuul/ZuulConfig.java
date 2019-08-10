package com.cloud.admin.zuul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 韩炜
 * @date 2019-08-10 18:41
 */
@Configuration
public class ZuulConfig {

    @Bean
    public RequestFilter logFilter(){
        return new RequestFilter();
    }

}
