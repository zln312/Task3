package com.service;

import com.entity.Reply;
import com.mapper.ReplyMapper;
import com.service.services.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return replyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Reply record) {
        return replyMapper.insert(record);
    }

    @Override
    public int insertSelective(Reply record) {
        return replyMapper.insertSelective(record);
    }

    @Override
    public Reply selectByPrimaryKey(Long wordsId) {
        return replyMapper.selectByPrimaryKey(wordsId);
    }

    @Override
    public int updateByPrimaryKeySelective(Reply record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Reply record) {
        return updateByPrimaryKey(record);
    }
}
