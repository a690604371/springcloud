package com.ice.system.controller;

import com.ice.system.entity.TestEO;
import com.ice.system.service.TestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: systemcloud->TestController_Consumer
 * @description: 消费者Controller
 * @author: libing
 * @create: 2019-10-16 09:00
 **/
@RestController
public class TestController_Consumer {

    @Autowired
    private TestClientService service;

    @RequestMapping(value = "/consumer/test/get/{id}")
    public TestEO get(@PathVariable("id") int id)
    {
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/test/list")
    public List<TestEO> list()
    {
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/test/add")
    public Object add(TestEO test)
    {
        return this.service.add(test);
    }

}
