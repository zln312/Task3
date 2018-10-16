package com.service;

import com.entity.Art;
import com.mapper.ArtMapper;
import com.service.services.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtServiceImpl implements ArtService {
    @Autowired
    private ArtMapper artMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return artMapper.deleteByPrimaryKey(id);

    }

    @Override
    public int insert(Art record) {
     return    artMapper.insert(record);

    }

    @Override
    public int insertSelective(Art record) {
      return   artMapper.insertSelective(record);
    }

    @Override
    public List<Art> selectByPrimaryKey(int status, int type) {
        return artMapper.selectByPrimaryKey(status,type);
    }

    @Override
    public int updateByPrimaryKeySelective(Art record) {
        return artMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Art record) {
        return artMapper.updateByPrimaryKey(record);
    }
}
