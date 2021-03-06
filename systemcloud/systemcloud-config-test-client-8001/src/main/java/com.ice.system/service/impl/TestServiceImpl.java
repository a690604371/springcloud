package com.ice.system.service.impl;

import com.ice.system.dao.TestEOMapper;
import com.ice.system.entity.TestEO;
import com.ice.system.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: systemcloud->TestServiceImpl
 * @description:
 * @author: libing
 * @create: 2019-10-15 17:48
 **/
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestEOMapper testEOMapper;


    @Override
    public boolean add(TestEO testEO) {
        return testEOMapper.insert(testEO);
    }

    @Override
    public TestEO get(int id) {
        return testEOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TestEO> list() {
        return testEOMapper.selectList();
    }


}
