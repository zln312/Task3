package com.mapper;

import com.entity.Words;

import java.util.List;

public interface WordsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Words record);

    int insertSelective(Words record);

    List selectByWorksId(Long WorksId);

    int updateByPrimaryKeySelective(Words record);

    int updateByPrimaryKey(Words record);
}