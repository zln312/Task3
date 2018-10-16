package com.service.services;

import com.entity.Works;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface WorksService {
    int deleteByPrimaryKey(Long id);

    int insert(Works record);

    int insertSelective(Works record);

    Works selectByPrimaryKey(Long id);

    List select(@Param("name")String name, @Param("secondId")Long secondId);

    int updateByPrimaryKeySelective(Works record);

    int updateByPrimaryKey(Works record);
}
