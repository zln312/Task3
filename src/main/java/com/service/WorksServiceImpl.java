package com.service;

import com.entity.Works;
import com.mapper.WorksMapper;
import com.service.services.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksServiceImpl implements WorksService {
    @Autowired
    private WorksMapper worksMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return worksMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Works record) {
        return worksMapper.insert(record);
    }

    @Override
    public int insertSelective(Works record) {
        return worksMapper.insertSelective(record);
    }

    @Override
    public Works selectByPrimaryKey(Long id) {
        return worksMapper.selectByPrimaryKey(id);
    }

    @Override
    public List select(String name, Long secondId) {
        return worksMapper.select(name, secondId);
    }

    @Override
    public int updateByPrimaryKeySelective(Works record) {
        return worksMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Works record) {
        return worksMapper.updateByPrimaryKey(record);
    }
}
