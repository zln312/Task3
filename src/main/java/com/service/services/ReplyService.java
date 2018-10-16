package com.service.services;

import com.entity.Reply;
import org.springframework.stereotype.Service;

@Service
public interface ReplyService {
    int deleteByPrimaryKey(Long id);

    int insert(Reply record);

    int insertSelective(Reply record);

    Reply selectByPrimaryKey(Long wordsId);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);
}
