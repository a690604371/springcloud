package com.ice.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: systemcloud->TestConsumer80_APP
 * @description:
 * @author: libing
 * @create: 2019-10-16 10:06
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.ice.system"})
public class TestConsumerFeign_APP {

    public static void main(String[] args) {
        SpringApplication.run(TestConsumerFeign_APP.class,args);
    }

}
