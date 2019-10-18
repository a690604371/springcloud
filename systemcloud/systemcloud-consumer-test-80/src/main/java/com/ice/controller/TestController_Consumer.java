package com.ice.controller;

import com.ice.entity.TestEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: systemcloud->TestController_Consumer
 * @description: 消费者Controller
 * @author: libing
 * @create: 2019-10-16 09:00
 **/
@RestController
public class TestController_Consumer {

//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://SYSTEMCLOUD-TEST";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/list")
    public List<TestEO> list() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/test/list",List.class);
    }

    @GetMapping("/consumer/add")
    public boolean add(TestEO testEO) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/test/add",testEO,Boolean.class);
    }

    @GetMapping("/consumer/get/{id}")
    public TestEO get(@PathVariable String id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/test/get/"+id,TestEO.class);
    }

    @GetMapping("/consumer/get/discovery")
    public Object get() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/test/discovery",Object.class);
    }


}
