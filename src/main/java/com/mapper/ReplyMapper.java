package com.mapper;

import com.entity.Reply;

public interface ReplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Long WordsId);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}