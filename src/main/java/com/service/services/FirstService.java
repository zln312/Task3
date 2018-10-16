package com.service.services;

import com.entity.First;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FirstService {
    int deleteByPrimaryKey(Long id);

    int insert(First record);

    int insertSelective(First record);

    List selectByPrimaryKey(@Param("name") String name, @Param("status") Boolean status);

    int updateByPrimaryKeySelective(First record);

    int updateByPrimaryKey(First record);
}
