package com.ice.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: systemcloud->MySelfRule
 * @description: Ribbon自定义规则
 * @author: libing
 * @create: 2019-10-21 10:07
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
//        return new MyRule();
    }
}
