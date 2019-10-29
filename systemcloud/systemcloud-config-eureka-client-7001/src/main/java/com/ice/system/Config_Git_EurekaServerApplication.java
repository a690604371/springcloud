package com.ice.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: systemcloud->Config_Git_EurekaServerApplication
 * @description:
 * @author: libing
 * @create: 2019-10-28 16:19
 **/
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApplication.class,args);
    }

}
