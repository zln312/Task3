package com.mapper;

import com.entity.Second;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SecondMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Second record);

    int insertSelective(Second record);

    List select(@Param("name") String name,@Param("status") Boolean status,@Param("firstId") Long firstId);

    int updateByPrimaryKeySelective(Second record);

    int updateByPrimaryKey(Second record);
}