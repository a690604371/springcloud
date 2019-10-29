package com.ice.system.controller;

import com.ice.system.entity.TestEO;
import com.ice.system.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
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
    private TestService service;

    @RequestMapping(value = "/test/get/{id}", method = RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public TestEO get(@PathVariable("id") int id) {

        TestEO dept = this.service.get(id);

        if (null == dept) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }

        return dept;
    }

    public TestEO processHystrix_Get(@PathVariable("id") int id) {
        return new TestEO().setId(id).setName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setTableName("no this database in MySQL");
    }

}
