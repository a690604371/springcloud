package com.ice.system.service;

import com.ice.system.entity.TestEO;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: systemcloud->TestClientServiceFallbackFactory
 * @description:
 * @author: libing
 * @create: 2019-10-22 09:21
 **/
@Component // 不要忘记添加，不要忘记添加
public class TestClientServiceFallbackFactory  implements FallbackFactory<TestClientService> {

    @Override
    public TestClientService create(Throwable throwable)
    {
        return new TestClientService() {
            @Override
            public TestEO get(int id)
            {
                return new TestEO().setId(id).setName("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setTableName("no this database in MySQL");
            }

            @Override
            public List<TestEO> list()
            {
                return null;
            }

            @Override
            public boolean add(TestEO test)
            {
                return false;
            }
        };
    }

}
