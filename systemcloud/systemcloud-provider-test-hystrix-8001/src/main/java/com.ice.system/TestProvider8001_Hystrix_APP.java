package com.ice.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: systemcloud->TestProvider8001_Hystrix_APP
 * @description:
 * @author: libing
 * @create: 2019-10-15 18:24
 **/
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class TestProvider8001_Hystrix_APP {

    public static void main(String[] args) {
        SpringApplication.run(TestProvider8001_Hystrix_APP.class,args);
    }

}
