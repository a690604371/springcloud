package com.ice.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: systemcloud->TestProvider8001_APP
 * @description:
 * @author: libing
 * @create: 2019-10-15 18:24
 **/
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
public class TestProvider8002_APP {

    public static void main(String[] args) {
        SpringApplication.run(TestProvider8002_APP.class,args);
    }

}
