package com.service;

import com.entity.Words;
import com.mapper.WordsMapper;
import com.service.services.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordsServiceImpl implements WordsService {
    @Autowired
    private WordsMapper wordsMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return wordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Words record) {
        return wordsMapper.insert(record);
    }

    @Override
    public int insertSelective(Words record) {
        return wordsMapper.insertSelective(record);
    }

    @Override
    public List selectByWorksId(Long worksId) {
        return wordsMapper.selectByWorksId(worksId);
    }

    @Override
    public int updateByPrimaryKeySelective(Words record) {
        return wordsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Words record) {
        return wordsMapper.updateByPrimaryKey(record);
    }
}
