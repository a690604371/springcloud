package com.ice.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: systemcloud->SystemcloudEureka7002Application
 * @description:
 * @author: libing
 * @create: 2019-10-16 16:42
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002_APP {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_APP.class, args);
    }

}
