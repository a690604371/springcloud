package com.ice.service;

import com.ice.entity.TestEO;

import java.util.List;

public interface TestService {

    boolean add(TestEO testEO);

    TestEO get(int id);

    List<TestEO> list();
}
