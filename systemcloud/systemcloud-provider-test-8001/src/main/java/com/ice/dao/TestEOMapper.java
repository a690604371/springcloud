package com.ice.dao;

import com.ice.entity.TestEO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestEOMapper {
    int deleteByPrimaryKey(Integer id);

    boolean insert(TestEO record);

    int insertSelective(TestEO record);

    List<TestEO> selectList();

    TestEO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestEO record);

    int updateByPrimaryKey(TestEO record);
}