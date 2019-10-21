package com.ice.system.service;

import com.ice.system.entity.TestEO;

import java.util.List;

public interface TestService {

    boolean add(TestEO testEO);

    TestEO get(int id);

    List<TestEO> list();
}
