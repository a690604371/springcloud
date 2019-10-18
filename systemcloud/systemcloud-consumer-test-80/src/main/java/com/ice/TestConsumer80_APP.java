package com.ice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: systemcloud->TestConsumer80_APP
 * @description:
 * @author: libing
 * @create: 2019-10-16 10:06
 **/
@SpringBootApplication
@EnableEurekaClient
public class TestConsumer80_APP {

    public static void main(String[] args) {
        SpringApplication.run(TestConsumer80_APP.class,args);
    }

}
