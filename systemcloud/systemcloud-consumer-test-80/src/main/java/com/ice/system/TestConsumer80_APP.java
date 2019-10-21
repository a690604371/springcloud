package com.ice.system;

import com.ice.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: systemcloud->TestConsumer80_APP
 * @description:
 * @author: libing
 * @create: 2019-10-16 10:06
 **/
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name="SYSTEMCLOUD-TEST",configuration= MySelfRule.class)
public class TestConsumer80_APP {

    public static void main(String[] args) {
        SpringApplication.run(TestConsumer80_APP.class,args);
    }

}
