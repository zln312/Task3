package com.service;

import com.entity.First;
import com.mapper.FirstMapper;
import com.service.services.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstServiceImpl implements FirstService {
    @Autowired
    private FirstMapper firstMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return firstMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(First record) {
        return firstMapper.insert(record);
    }

    @Override
    public int insertSelective(First record) {
        return firstMapper.insertSelective(record);
    }

    @Override
    public List selectByPrimaryKey(String name, Boolean status) {
        return firstMapper.selectByPrimaryKey(name,status);
    }

    @Override
    public int updateByPrimaryKeySelective(First record) {
        return firstMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(First record) {
        return firstMapper.updateByPrimaryKey(record);
    }
}
