package com.service;

import com.entity.Second;
import com.mapper.SecondMapper;
import com.service.services.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondMapper secondMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return secondMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Second record) {
        return secondMapper.insert(record);
    }

    @Override
    public int insertSelective(Second record) {
        return secondMapper.insertSelective(record);
    }

    @Override
    public List select(String name, Boolean status, Long firstId) {
        return secondMapper.select(name, status, firstId);
    }

    @Override
    public int updateByPrimaryKeySelective(Second record) {
        return secondMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Second record) {
        return secondMapper.updateByPrimaryKey(record);
    }
}
