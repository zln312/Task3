package com.mapper;

import com.entity.First;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirstMapper {
    int deleteByPrimaryKey(Long id);

    int insert(First record);

    int insertSelective(First record);

    List selectByPrimaryKey(@Param("name") String name, @Param("status") Boolean status);

    int updateByPrimaryKeySelective(First record);

    int updateByPrimaryKey(First record);
}