package com.mapper;

import com.entity.Art;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArtMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Art record);

    int insertSelective(Art record);

    List<Art> selectByPrimaryKey(@Param("status") int status,@Param("type") int type);

    int updateByPrimaryKeySelective(Art record);

    int updateByPrimaryKey(Art record);
}