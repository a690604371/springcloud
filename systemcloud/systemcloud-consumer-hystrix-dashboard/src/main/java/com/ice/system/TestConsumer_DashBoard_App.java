package com.ice.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: systemcloud->TestConsumer_DashBoard_App
 * @description:
 * @author: libing
 * @create: 2019-10-22 10:01
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class TestConsumer_DashBoard_App {

    public static void main(String[] args) {
        SpringApplication.run(TestConsumer_DashBoard_App.class,args);
    }

}
