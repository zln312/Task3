package com.service;

import com.entity.Banner;
import com.mapper.BannerMapper;
import com.service.services.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Banner record) {
        return bannerMapper.insert(record);
    }

    @Override
    public int insertSelective(Banner record) {
        return bannerMapper.insertSelective(record);
    }

    @Override
    public List selectByPrimaryKey(Long id) {
        return bannerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List selectByStatus(Boolean status) {
        return bannerMapper.selectByStatus(status);
    }

    @Override
    public int updateByPrimaryKeySelective(Banner record) {
        return bannerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Banner record) {
        return bannerMapper.updateByPrimaryKey(record);
    }
}
