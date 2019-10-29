package com.ice.system.controller;

import com.ice.system.entity.TestEO;
import com.ice.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: systemcloud->TestController
 * @description: 测试
 * @author: libing
 * @create: 2019-10-15 17:43
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/test/add")
    public boolean add(@RequestBody TestEO testEO) {
        return testService.add(testEO);
    }

    @GetMapping("/test/get/{id}")
    public TestEO get(@PathVariable("id") int id) {
        return testService.get(id);
    }

    @GetMapping("/test/list")
    public List<TestEO> list() {
        return testService.list();
    }

    @RequestMapping(value = "/test/discovery", method = RequestMethod.GET)
    public Object discovery()
    {
        List<String> list = discoveryClient.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = discoveryClient.getInstances("SYSTEMCLOUD-TEST");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }




}
