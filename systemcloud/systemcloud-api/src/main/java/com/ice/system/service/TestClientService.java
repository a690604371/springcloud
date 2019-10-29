package com.ice.system.service;

import com.ice.system.entity.TestEO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @program: systemcloud->TestClientService
 * @description:
 * @author: libing
 * @create: 2019-10-21 15:25
 **/
@FeignClient(value = "SYSTEMCLOUD-TEST",fallbackFactory=TestClientServiceFallbackFactory.class)
public interface TestClientService {

    @RequestMapping(value = "/test/get/{id}", method = RequestMethod.GET)
    public TestEO get(@PathVariable("id") int id);

    @RequestMapping(value = "/test/list", method = RequestMethod.GET)
    public List<TestEO> list();

    @RequestMapping(value = "/test/add", method = RequestMethod.POST)
    public boolean add(TestEO test);

}
