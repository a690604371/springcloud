package com.ice.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: systemcloud->SystemcloudEureka7003Application
 * @description:
 * @author: libing
 * @create: 2019-10-16 16:42
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7003_APP {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_APP.class, args);
    }

}
